package com.group7.edu.service.lxh.impl;

import com.group7.edu.entity.lxh.SysAboutus;
import com.group7.edu.mapper.lxh.SysAboutusMapperLxh;
import com.group7.edu.service.lxh.SysAboutusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sysAboutusServiceLxh")
public class SysAboutusServiceImpl implements SysAboutusService {

    @Resource
    private SysAboutusMapperLxh sysAboutusMapperLxh;
    @Override
    public SysAboutus selectByPrimaryKey(Integer id) {

        return  sysAboutusMapperLxh.selectByPrimaryKey(id);
    }
}