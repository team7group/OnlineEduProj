package com.group7.edu.utils;

import com.group7.edu.entity.SysCourse;
import com.group7.edu.entity.SysCourseDTO;

public class CourseDTOUtils {


    public static SysCourseDTO toDTO(SysCourse sysCourse){
        SysCourseDTO sysCourseDTO = new SysCourseDTO();
        sysCourseDTO.setCoverUrl(sysCourse.getCoverUuid());
        sysCourseDTO.setCategory(sysCourse.getCategory());
        sysCourseDTO.setCourseText(sysCourse.getCourseText());
        sysCourseDTO.setCreatedTime(sysCourse.getCreatedTime());
        sysCourseDTO.setId(sysCourse.getId());
        sysCourseDTO.setName(sysCourse.getName());
        sysCourseDTO.setOrigPrice(sysCourse.getOrigPrice());
        sysCourseDTO.setLecturer(sysCourse.getLecturer());
        sysCourseDTO.setSubject(sysCourse.getSubject());
        sysCourseDTO.setStarttime(sysCourse.getStarttime());
        sysCourseDTO.setCoverUuid(sysCourse.getCoverUuid());
        sysCourseDTO.setPrice(sysCourse.getPrice());
        sysCourseDTO.setTerminalTime(sysCourse.getTerminalTime());
        return sysCourseDTO;
    }

}
