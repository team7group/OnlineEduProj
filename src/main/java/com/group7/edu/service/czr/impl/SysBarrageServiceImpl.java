package com.group7.edu.service.czr.impl;

import com.group7.edu.entity.SysBarrage;
import com.group7.edu.mapper.SysBarrageMapper;
import com.group7.edu.mapper.czr.SysBarrageExtMapper;
import com.group7.edu.service.czr.SysBarrageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysBarrageServiceImpl implements SysBarrageService {

    @Resource
    private SysBarrageMapper sysBarrageMapper;

    @Resource
    private SysBarrageExtMapper sysBarrageExtMapper;

    @Override
    public List<SysBarrage> findByIdDuration(Integer videoId, Integer progress, Integer duration, Integer offset, Integer length) {
        try {
            return sysBarrageExtMapper.selectByIdDuration(videoId, progress, progress + duration, offset, length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int add(SysBarrage barrage) {
        try {
            return sysBarrageMapper.insert(barrage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int addByBatch(SysBarrage barrage) {
        return 0;
    }

    @Override
    public List<String> findTop500(Integer vid) {
        try {
            return sysBarrageExtMapper.selectTop300(vid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
