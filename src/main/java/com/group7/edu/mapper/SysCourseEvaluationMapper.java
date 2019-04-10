package com.group7.edu.mapper;

import com.group7.edu.entity.SysCourseEvaluation;

public interface SysCourseEvaluationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCourseEvaluation record);

    int insertSelective(SysCourseEvaluation record);

    SysCourseEvaluation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCourseEvaluation record);

    int updateByPrimaryKey(SysCourseEvaluation record);

    int evaluation(int course);
}