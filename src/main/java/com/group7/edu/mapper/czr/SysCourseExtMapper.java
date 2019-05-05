package com.group7.edu.mapper.czr;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.dto.SysCourseEvaluationDTO;
import com.group7.edu.dto.SysPersonCourse;
import com.group7.edu.entity.SysAnswerQuestion;
import com.group7.edu.entity.SysCourse;
import com.group7.edu.entity.SysTeacher;

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

    Integer selectPersonalTotalCount(Integer uid, Integer off, Integer len);

    List<SysPersonCourse> selectPersonalCourse(Integer uid, Integer off, Integer len);

    List<SysCourse> selectAllCourse();

    List<SysTeacher> selectAllTeacher();
}
