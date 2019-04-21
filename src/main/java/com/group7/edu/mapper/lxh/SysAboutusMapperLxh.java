package com.group7.edu.mapper.lxh;

import com.group7.edu.entity.lxh.SysAboutus;

public interface SysAboutusMapperLxh {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAboutus record);

    int insertSelective(SysAboutus record);

    SysAboutus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAboutus record);

    int updateByPrimaryKey(SysAboutus record);
}