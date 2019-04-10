package com.group7.edu.mapper;

import com.group7.edu.entity.SysStudent;

public interface SysStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysStudent record);

    int insertSelective(SysStudent record);

    SysStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysStudent record);

    int updateByPrimaryKey(SysStudent record);
}