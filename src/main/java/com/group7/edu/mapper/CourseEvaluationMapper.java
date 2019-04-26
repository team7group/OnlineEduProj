package com.group7.edu.mapper;

import com.group7.edu.entity.CourseEvaluation;
import com.group7.edu.entity.CourseEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseEvaluationMapper {
    long countByExample(CourseEvaluationExample example);

    int deleteByExample(CourseEvaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseEvaluation record);

    int insertSelective(CourseEvaluation record);

    List<CourseEvaluation> selectByExample(CourseEvaluationExample example);

    CourseEvaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseEvaluation record, @Param("example") CourseEvaluationExample example);

    int updateByExample(@Param("record") CourseEvaluation record, @Param("example") CourseEvaluationExample example);

    int updateByPrimaryKeySelective(CourseEvaluation record);

    int updateByPrimaryKey(CourseEvaluation record);
}