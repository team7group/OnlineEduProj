package com.group7.edu;

import com.alibaba.fastjson.JSON;
import com.group7.edu.dto.SysStudentDTO;
import com.group7.edu.mapper.SysVideoMapper;
import com.group7.edu.service.SysServiceTypeService;
import com.group7.edu.service.SysStudentService;
import com.group7.edu.utils.ResultData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EduApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Resource
    private SysVideoMapper sysVideoMapper;

    @Test
    public void insertVideo() {
//        ThreadLocalRandom rnd = ThreadLocalRandom.current();
//        for (int i = 0; i < 520; i++) {
//            SysVideo sysVideo = new SysVideo();
//            sysVideo.setName(PasswordUtils.genSalt());
//            sysVideo.setCourse(i % 2 + 1);
//            sysVideo.setCapter(i % 3 + 1);
//            sysVideo.setPart(rnd.nextInt(1, 100));
//            sysVideo.setCoverUuid(PasswordUtils.md5Hash(PasswordUtils.genSalt(),
//                    String.valueOf(i)));
//            sysVideo.setDuration(new Date(System.currentTimeMillis() << 5));
//            sysVideo.setFileUuid(PasswordUtils.md5Hash(PasswordUtils.genSalt(),
//                    String.valueOf(i)));
//            sysVideo.setSharingTimes(rnd.nextInt(10, 1000));
//            sysVideo.setLikeTimes(rnd.nextInt(10, 1000));
//            sysVideo.setCollectionTimes(rnd.nextInt(10, 1000));
//            if (sysVideoMapper.insert(sysVideo) > 0) {
//                System.out.println("sysVideo = " + sysVideo);
//            }
//        }
    }

    @Resource
    SysStudentService sysStudentService;
    @Test
    public void register(){
        SysStudentDTO sysStudent = new SysStudentDTO();
        sysStudent.setUsername("admin");
        sysStudent.setNickname("11111");
        sysStudent.setBanned(true);
        sysStudent.setCheckinDays(1);
        sysStudent.setNumber(5);
        sysStudent.setPassword("admin");
        sysStudent.setPhone("110");
        sysStudent.setEmail("120");
        sysStudentService.register(sysStudent);
    }
    @Resource
    SysServiceTypeService sysServiceTypeService;
    @Test
    public void ServiceType(){
        ResultData resultData = sysServiceTypeService.selectServiceType();
        System.out.println("JSON.toJSON(resultData) = " + JSON.toJSON(resultData));
    }

}
