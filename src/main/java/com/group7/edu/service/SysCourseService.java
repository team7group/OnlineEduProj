package com.group7.edu.service;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.dto.SysCourseEvaluationDTO;
import com.group7.edu.entity.SysAnswerQuestion;
import com.group7.edu.entity.SysCourse;

import java.util.List;

public interface SysCourseService {

    SysCourse findById(Integer id);

    SysCourseDTO findCourseDetails(Integer courseId);

    List<SysAnswerQuestion> findQaByPage(int page, int pageSize);

    Integer findQaCount(Integer courseId);

    String findSyllabus(Integer courseId);

    List<SysCourseEvaluationDTO> findCourseEvaluationById(Integer courseId);
}
