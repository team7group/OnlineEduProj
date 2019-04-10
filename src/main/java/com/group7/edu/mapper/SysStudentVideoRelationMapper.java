package com.group7.edu.mapper;

import com.group7.edu.entity.SysStudentVideoRelation;

public interface SysStudentVideoRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysStudentVideoRelation record);

    int insertSelective(SysStudentVideoRelation record);

    SysStudentVideoRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysStudentVideoRelation record);

    int updateByPrimaryKey(SysStudentVideoRelation record);
}