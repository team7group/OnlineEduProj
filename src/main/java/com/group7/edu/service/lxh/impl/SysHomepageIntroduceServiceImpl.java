package com.group7.edu.service.lxh.impl;

import com.group7.edu.entity.lxh.SysHomepageIntroduce;
import com.group7.edu.mapper.lxh.SysHomepageIntroduceMapperLxh;
import com.group7.edu.service.lxh.SysHomepageIntroduceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sysHomepageIntroduceServiceLxh")
public class SysHomepageIntroduceServiceImpl implements SysHomepageIntroduceService {

    @Resource
    private SysHomepageIntroduceMapperLxh sysHomepageIntroduceMapperLxh;
    @Override
    public SysHomepageIntroduce selectByPrimaryKey(Integer id) {
        return sysHomepageIntroduceMapperLxh.selectByPrimaryKey(id);
    }
}