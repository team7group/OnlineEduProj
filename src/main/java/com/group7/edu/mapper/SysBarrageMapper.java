package com.group7.edu.mapper;

import com.group7.edu.entity.SysBarrage;
import com.group7.edu.entity.SysBarrageKey;

public interface SysBarrageMapper {
    int deleteByPrimaryKey(SysBarrageKey key);

    int insert(SysBarrage record);

    int insertSelective(SysBarrage record);

    SysBarrage selectByPrimaryKey(SysBarrageKey key);

    int updateByPrimaryKeySelective(SysBarrage record);

    int updateByPrimaryKey(SysBarrage record);
}