package com.group7.edu.mapper;

import com.group7.edu.dto.SysCourseDTO;

import java.util.List;

public interface SysCourseExtMapper {
    List<SysCourseDTO> selectCourseDetails(Integer courseId);
}
