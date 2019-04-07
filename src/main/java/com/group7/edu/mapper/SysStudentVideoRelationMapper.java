package com.group7.edu.mapper;

import com.group7.edu.entity.SysStudentVideoRelation;
import com.group7.edu.entity.SysStudentVideoRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStudentVideoRelationMapper {
    long countByExample(SysStudentVideoRelationExample example);

    int deleteByExample(SysStudentVideoRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysStudentVideoRelation record);

    int insertSelective(SysStudentVideoRelation record);

    List<SysStudentVideoRelation> selectByExample(SysStudentVideoRelationExample example);

    SysStudentVideoRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysStudentVideoRelation record, @Param("example") SysStudentVideoRelationExample example);

    int updateByExample(@Param("record") SysStudentVideoRelation record, @Param("example") SysStudentVideoRelationExample example);

    int updateByPrimaryKeySelective(SysStudentVideoRelation record);

    int updateByPrimaryKey(SysStudentVideoRelation record);
}