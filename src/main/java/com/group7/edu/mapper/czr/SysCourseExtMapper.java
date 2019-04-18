package com.group7.edu.mapper.czr;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.dto.SysCourseEvaluationDTO;
import com.group7.edu.entity.SysAnswerQuestion;

import java.util.List;

/**
 * @author c
 */
public interface SysCourseExtMapper {

    List<SysCourseDTO> selectCourseDetails(Integer courseId);

    List<SysAnswerQuestion> selectByPage(int off, int len);

    Integer selectQaCount(Integer courseId);

    List<String> selectSyllabusById(Integer courseId);

    List<SysCourseEvaluationDTO> selectCourseEvaluationById(Integer courseId, Integer off, Integer len);

    Integer selectEvaluationCount(Integer courseId);
}
