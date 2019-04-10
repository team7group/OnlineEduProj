package com.group7.edu.mapper;

import com.group7.edu.entity.SysGroup;

import java.util.List;

public interface SysGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysGroup record);

    int insertSelective(SysGroup record);

    SysGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysGroup record);

    int updateByPrimaryKey(SysGroup record);

    List<SysGroup> notice(int id);
}