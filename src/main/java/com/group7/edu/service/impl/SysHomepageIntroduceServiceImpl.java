package com.group7.edu.service.impl;

import com.group7.edu.entity.SysHomepageIntroduce;
import com.group7.edu.mapper.SysHomepageIntroduceMapper;
import com.group7.edu.service.SysHomepageIntroduceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysHomepageIntroduceServiceImpl implements SysHomepageIntroduceService {

    @Resource
    private SysHomepageIntroduceMapper sysHomepageIntroduceMapper;
    @Override
    public SysHomepageIntroduce selectByPrimaryKey(Integer id) {
        return sysHomepageIntroduceMapper.selectByPrimaryKey(id);
    }
}