package com.group7.edu.mapper;

import com.group7.edu.entity.SysDepartmentEvaluation;
import com.group7.edu.entity.SysDepartmentEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDepartmentEvaluationMapper {
    long countByExample(SysDepartmentEvaluationExample example);

    int deleteByExample(SysDepartmentEvaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysDepartmentEvaluation record);

    int insertSelective(SysDepartmentEvaluation record);

    List<SysDepartmentEvaluation> selectByExampleWithBLOBs(SysDepartmentEvaluationExample example);

    List<SysDepartmentEvaluation> selectByExample(SysDepartmentEvaluationExample example);

    SysDepartmentEvaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysDepartmentEvaluation record, @Param("example") SysDepartmentEvaluationExample example);

    int updateByExampleWithBLOBs(@Param("record") SysDepartmentEvaluation record, @Param("example") SysDepartmentEvaluationExample example);

    int updateByExample(@Param("record") SysDepartmentEvaluation record, @Param("example") SysDepartmentEvaluationExample example);

    int updateByPrimaryKeySelective(SysDepartmentEvaluation record);

    int updateByPrimaryKeyWithBLOBs(SysDepartmentEvaluation record);

    int updateByPrimaryKey(SysDepartmentEvaluation record);
}