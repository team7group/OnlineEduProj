package com.group7.edu.mapper.lxh;

import com.group7.edu.entity.lxh.SysIndustryInfo;

import java.util.List;

public interface SysIndustryInfoMapperLxh {
    int deleteByPrimaryKey(Integer id);

    int insert(SysIndustryInfo record);

    int insertSelective(SysIndustryInfo record);

    SysIndustryInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysIndustryInfo record);

    int updateByPrimaryKey(SysIndustryInfo record);

    List<SysIndustryInfo> infoList(SysIndustryInfo info);
}