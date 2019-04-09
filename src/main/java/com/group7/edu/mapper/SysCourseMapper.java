package com.group7.edu.mapper;

import com.group7.edu.entity.SysCourse;

public interface SysCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCourse record);

    int insertSelective(SysCourse record);

    SysCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCourse record);

    int updateByPrimaryKey(SysCourse record);
}