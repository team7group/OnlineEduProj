package com.group7.edu.mapper.wjy;

import com.group7.edu.entity.SysCourse;

import java.util.List;

public interface SysCourseMapperWjy {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCourse record);

    int insertSelective(SysCourse record);

    SysCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCourse record);

    int updateByPrimaryKey(SysCourse record);

    //通过 用户的订单查询所有的 课程
    List<SysCourse> find(Integer uid);
}