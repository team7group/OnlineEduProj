package com.group7.edu.service.impl;

import com.group7.edu.entity.SysAboutus;
import com.group7.edu.mapper.SysAboutusMapper;
import com.group7.edu.service.SysAboutusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysAboutusServiceImpl implements SysAboutusService {

    @Resource
    private SysAboutusMapper sysAboutusMapper;
    @Override
    public SysAboutus selectByPrimaryKey(Integer id) {

        return  sysAboutusMapper.selectByPrimaryKey(id);
    }
}