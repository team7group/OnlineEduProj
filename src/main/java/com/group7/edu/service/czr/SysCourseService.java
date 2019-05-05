package com.group7.edu.service.czr;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.dto.SysPersonCourse;
import com.group7.edu.entity.SysAnswerQuestion;
import com.group7.edu.entity.SysCourse;
import com.group7.edu.utils.ResultData;

import java.util.List;

public interface SysCourseService {

    SysCourse findById(Integer id);

    SysCourseDTO findCourseDetails(Integer courseId);

    List<SysAnswerQuestion> findQaByPage(int page, int pageSize);

    Integer findQaCount(Integer courseId);

    String findSyllabus(Integer courseId);

    ResultData findCourseEvaluationById(Integer courseId, Integer page, Integer pageSize);

    Integer getPersonalTotalPage(Integer uid, Integer pageSize);

    List<SysPersonCourse> getPersonalCourse(Integer uid, Integer pageNum, Integer pageSize);

    ResultData findCoursesInfo();
}
