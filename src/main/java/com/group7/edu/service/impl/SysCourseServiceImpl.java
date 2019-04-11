package com.group7.edu.service.impl;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.entity.SysCourse;
import com.group7.edu.mapper.SysCourseExtMapper;
import com.group7.edu.mapper.SysCourseMapper;
import com.group7.edu.service.SysCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author c
 */
@Service
public class SysCourseServiceImpl implements SysCourseService {

    @Resource
    private SysCourseMapper sysCourseMapper;

    @Resource
    private SysCourseExtMapper sysCourseExtMapper;

    @Override
    public SysCourse findById(Integer id) {
        try {
            return sysCourseMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysCourseDTO findCourseDetails(Integer courseId) {
        SysCourseDTO sysCourseDTO = null;
        try {
            List<SysCourseDTO> sysCourseDTOS = sysCourseExtMapper.selectCourseDetails(courseId);
            if (sysCourseDTOS != null && !sysCourseDTOS.isEmpty()) {
                sysCourseDTO = sysCourseDTOS.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sysCourseDTO;
    }
}
