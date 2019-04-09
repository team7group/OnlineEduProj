package com.group7.edu.mapper;

import com.group7.edu.entity.SysServiceType;

public interface SysServiceTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysServiceType record);

    int insertSelective(SysServiceType record);

    SysServiceType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysServiceType record);

    int updateByPrimaryKey(SysServiceType record);
}