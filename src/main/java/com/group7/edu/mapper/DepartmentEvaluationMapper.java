package com.group7.edu.mapper;

import com.group7.edu.entity.DepartmentEvaluation;
import com.group7.edu.entity.DepartmentEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentEvaluationMapper {
    long countByExample(DepartmentEvaluationExample example);

    int deleteByExample(DepartmentEvaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DepartmentEvaluation record);

    int insertSelective(DepartmentEvaluation record);

    List<DepartmentEvaluation> selectByExampleWithBLOBs(DepartmentEvaluationExample example);

    List<DepartmentEvaluation> selectByExample(DepartmentEvaluationExample example);

    DepartmentEvaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DepartmentEvaluation record, @Param("example") DepartmentEvaluationExample example);

    int updateByExampleWithBLOBs(@Param("record") DepartmentEvaluation record, @Param("example") DepartmentEvaluationExample example);

    int updateByExample(@Param("record") DepartmentEvaluation record, @Param("example") DepartmentEvaluationExample example);

    int updateByPrimaryKeySelective(DepartmentEvaluation record);

    int updateByPrimaryKeyWithBLOBs(DepartmentEvaluation record);

    int updateByPrimaryKey(DepartmentEvaluation record);
}