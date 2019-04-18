package com.group7.edu.mapper.hky;

import com.group7.edu.entity.SysCourseEvaluation;
import org.springframework.stereotype.Component;

@Component("sysCourseEvaluationMapperHky")
public interface SysCourseEvaluationMapperHky {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCourseEvaluation record);

    int insertSelective(SysCourseEvaluation record);

    SysCourseEvaluation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCourseEvaluation record);

    int updateByPrimaryKey(SysCourseEvaluation record);

    Double evaluation(int course);

    SysCourseEvaluation isEvaluate(int userId, int course);
}