package com.group7.edu.mapper;

import com.group7.edu.entity.SysDepartmentEvaluation;

public interface SysDepartmentEvaluationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDepartmentEvaluation record);

    int insertSelective(SysDepartmentEvaluation record);

    SysDepartmentEvaluation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDepartmentEvaluation record);

    int updateByPrimaryKeyWithBLOBs(SysDepartmentEvaluation record);

    int updateByPrimaryKey(SysDepartmentEvaluation record);
}