package com.group7.edu.mapper;

import com.group7.edu.entity.SysSyllabus;

public interface SysSyllabusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysSyllabus record);

    int insertSelective(SysSyllabus record);

    SysSyllabus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysSyllabus record);

    int updateByPrimaryKeyWithBLOBs(SysSyllabus record);
}