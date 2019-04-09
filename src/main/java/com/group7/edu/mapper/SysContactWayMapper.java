package com.group7.edu.mapper;

import com.group7.edu.entity.SysContactWay;

public interface SysContactWayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysContactWay record);

    int insertSelective(SysContactWay record);

    SysContactWay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysContactWay record);

    int updateByPrimaryKey(SysContactWay record);
}