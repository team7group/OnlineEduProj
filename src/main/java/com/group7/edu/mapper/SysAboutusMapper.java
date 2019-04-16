package com.group7.edu.mapper;

import com.group7.edu.entity.SysAboutus;

public interface SysAboutusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAboutus record);

    int insertSelective(SysAboutus record);

    SysAboutus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAboutus record);

    int updateByPrimaryKey(SysAboutus record);
}