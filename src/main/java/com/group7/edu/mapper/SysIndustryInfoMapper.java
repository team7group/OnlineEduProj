package com.group7.edu.mapper;

import com.group7.edu.entity.SysIndustryInfo;

public interface SysIndustryInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysIndustryInfo record);

    int insertSelective(SysIndustryInfo record);

    SysIndustryInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysIndustryInfo record);

    int updateByPrimaryKey(SysIndustryInfo record);
}