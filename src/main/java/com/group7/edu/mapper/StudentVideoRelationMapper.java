package com.group7.edu.mapper;

import com.group7.edu.entity.StudentVideoRelation;
import com.group7.edu.entity.StudentVideoRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentVideoRelationMapper {
    long countByExample(StudentVideoRelationExample example);

    int deleteByExample(StudentVideoRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentVideoRelation record);

    int insertSelective(StudentVideoRelation record);

    List<StudentVideoRelation> selectByExample(StudentVideoRelationExample example);

    StudentVideoRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentVideoRelation record, @Param("example") StudentVideoRelationExample example);

    int updateByExample(@Param("record") StudentVideoRelation record, @Param("example") StudentVideoRelationExample example);

    int updateByPrimaryKeySelective(StudentVideoRelation record);

    int updateByPrimaryKey(StudentVideoRelation record);
}