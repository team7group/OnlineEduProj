package com.group7.edu;

import com.group7.edu.entity.SysBarrage;
import com.group7.edu.mapper.SysBarrageMapper;
import com.group7.edu.mapper.czr.SysBarrageExtMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EduApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Resource
    private SysBarrageMapper sysBarrageMapper;

    @Resource
    private SysBarrageExtMapper sysBarrageExtMapper;

    private final int VIDEO_ID_MAX = 10;
    private final int USER_ID_MAX = 100000;
    private final int VIDEO_DURATION_MAX = 6000;
    private final int BARRAGE_MAX_COUNT = 5000000;

    private Integer[] videoIds = new Integer[VIDEO_ID_MAX];
    private Integer[] userIds = new Integer[USER_ID_MAX];

    private LinkedBlockingQueue<SysBarrage> barrages = new LinkedBlockingQueue<>();

    StringBuilder builder = new StringBuilder();

    @Test
    public void initBarrageTable() {
        // init videoIds
        System.out.println("init videoIds");
        for (int i = 0; i < VIDEO_ID_MAX; i++) {
            videoIds[i] = i + 1;
        }

        // init userIds
        System.out.println("init userIds");
        for (int i = 0; i < USER_ID_MAX; i++) {
            userIds[i] = i + 1;
        }

        // init text
        System.out.println("init text");
        try {
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream("D:/text"), StandardCharsets.UTF_8))) {
                char[] chars = new char[4096];
                for (int len = reader.read(chars, 0, 4096); len >= 0; len = reader.read(chars, 0, 4096)) {
                    for (char aChar : chars) {
                        switch (aChar) {
                            case ' ':
                            case ',':
                            case '.':
                            case '，':
                            case '。':
                            case '\r':
                            case '\n':
                            case '}':
                            case '{':
                            case '\"':
                            case '\'':
                            case '[':
                            case ']':
                            case ':':
                            case '(':
                            case ')': {
                                break;
                            }
                            default:{
                                builder.append(aChar);
                            }
                        }
                    }
                    System.out.println(len);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        System.out.println("text = " + builder.length());
        int len = builder.length();

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        // init barrage Object
        System.out.println("init barrage Object Array");
        SysBarrage sysBarrage;
        for (int i = 0; i < BARRAGE_MAX_COUNT; i++) {
            try {
                sysBarrage = new SysBarrage();
                sysBarrage.setId(null);
                sysBarrage.setVid(rnd.nextInt(1, VIDEO_ID_MAX));
                sysBarrage.setUid(rnd.nextInt(1, USER_ID_MAX));
                int n = rnd.nextInt(1, 16);
                sysBarrage.setPos((byte)(n > 3 ? 1 : n));
                sysBarrage.setDuration(rnd.nextInt(0, VIDEO_DURATION_MAX));
                sysBarrage.setCreatedTime(new Date());
                n = rnd.nextInt(0, len - 300);
                String str = builder.substring(n, n + rnd.nextInt(5, 128));
                sysBarrage.setBarrageText(str);
                barrages.put(sysBarrage);
                System.out.println("i = " + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        CopyOnWriteArrayList<Thread> list = new CopyOnWriteArrayList<>();

        // insert to database
        ExecutorService pool = Executors.newFixedThreadPool(16);
        for (int i = 0; i < 10; i++) {
            pool.submit(new Runnable() {
                List<SysBarrage> barrageList = new ArrayList<>();

                @Override
                public void run() {
                    list.add(Thread.currentThread());
                    boolean isEmpty = false;
                    while (!isEmpty) {
                        try {
                            SysBarrage barrage = barrages.poll();
                            if (barrage != null) {
                                barrageList.add(barrage);
                            }
                            if (barrageList.size() >= 1000 || barrages.isEmpty()) {
                                sysBarrageExtMapper.insertBatch(barrageList);
                                barrageList.clear();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        isEmpty = barrages.isEmpty();
                        if (barrages.isEmpty() && !list.isEmpty()) {
                            isEmpty = false;
                        }
                    }
                }
            });
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            stringBuilder.delete(0, stringBuilder.length());
            stringBuilder.append(barrages.size());
            for (Thread thread : list) {
                stringBuilder.append(" - ").append(thread.getState());
            }
            System.out.println(stringBuilder);
        }
    }
}



























