package com.group7.edu.mapper.lxh;

import com.group7.edu.entity.lxh.SysCourse;

import java.util.List;

public interface SysCourseMapperLxh {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCourse record);

    int insertSelective(SysCourse record);

    SysCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCourse record);

    int updateByPrimaryKey(SysCourse record);

    List<SysCourse> selectAllSysCourse(SysCourse sysCourse);

    List<SysCourse> courseList(SysCourse sysCourse);
}