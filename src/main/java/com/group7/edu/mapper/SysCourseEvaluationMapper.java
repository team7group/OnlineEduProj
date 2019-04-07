package com.group7.edu.mapper;

import com.group7.edu.entity.SysCourseEvaluation;
import com.group7.edu.entity.SysCourseEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCourseEvaluationMapper {
    long countByExample(SysCourseEvaluationExample example);

    int deleteByExample(SysCourseEvaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysCourseEvaluation record);

    int insertSelective(SysCourseEvaluation record);

    List<SysCourseEvaluation> selectByExample(SysCourseEvaluationExample example);

    SysCourseEvaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysCourseEvaluation record, @Param("example") SysCourseEvaluationExample example);

    int updateByExample(@Param("record") SysCourseEvaluation record, @Param("example") SysCourseEvaluationExample example);

    int updateByPrimaryKeySelective(SysCourseEvaluation record);

    int updateByPrimaryKey(SysCourseEvaluation record);
}