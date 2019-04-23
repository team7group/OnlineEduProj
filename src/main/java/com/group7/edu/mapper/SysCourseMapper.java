package com.group7.edu.mapper;

import com.group7.edu.entity.SysCourse;

import java.util.List;

public interface SysCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCourse record);

    int insertSelective(SysCourse record);

    SysCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCourse record);

    int updateByPrimaryKey(SysCourse record);

    //通过 用户的订单查询所有的 课程
    List<SysCourse> find(SysCourse sysCourse);
}