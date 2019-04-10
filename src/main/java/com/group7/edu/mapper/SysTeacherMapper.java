package com.group7.edu.mapper;

import com.group7.edu.entity.SysTeacher;

public interface SysTeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysTeacher record);

    int insertSelective(SysTeacher record);

    SysTeacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysTeacher record);

    int updateByPrimaryKey(SysTeacher record);
}