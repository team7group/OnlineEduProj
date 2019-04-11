package com.group7.edu.service;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.entity.SysCourse;

public interface SysCourseService {

    SysCourse findById(Integer id);

    SysCourseDTO findCourseDetails(Integer courseId);

}
