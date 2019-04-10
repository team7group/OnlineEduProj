package com.group7.edu.mapper;

import com.group7.edu.entity.SysOrder;

public interface SysOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    SysOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);
}