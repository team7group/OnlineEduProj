package com.group7.edu.service.impl;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.dto.SysCourseEvaluationDTO;
import com.group7.edu.entity.SysAnswerQuestion;
import com.group7.edu.entity.SysCourse;
import com.group7.edu.mapper.SysCourseExtMapper;
import com.group7.edu.mapper.SysCourseMapper;
import com.group7.edu.oss.OssPicture;
import com.group7.edu.service.SysCourseService;
import org.codehaus.plexus.util.StringUtils;
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

    @Resource
    private OssPicture ossPicture;

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
                SysCourseDTO courseDTO = sysCourseDTOS.get(0);
                courseDTO.setTeacherIcon(ossPicture.compressionfixation(courseDTO.getTeacherIcon()));
                sysCourseDTO = courseDTO;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sysCourseDTO;
    }

    @Override
    public List<SysAnswerQuestion> findQaByPage(int page, int pageSize) {
        try {
            return sysCourseExtMapper.selectByPage((page - 1) * pageSize, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer findQaCount(Integer courseId) {
        try {
            return sysCourseExtMapper.selectQaCount(courseId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String findSyllabus(Integer courseId) {
        String syllabusJson = null;
        try {
            List<String> syllabusList = sysCourseExtMapper.selectSyllabusById(courseId);
            if (syllabusList != null && !syllabusList.isEmpty()) {
                syllabusJson = syllabusList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return syllabusJson;
    }

    @Override
    public List<SysCourseEvaluationDTO> findCourseEvaluationById(Integer courseId) {
        List<SysCourseEvaluationDTO> evaluations = null;
        try {
            evaluations = sysCourseExtMapper.selectCourseEvaluationById(courseId);
            if (evaluations != null) {
                for (SysCourseEvaluationDTO evaluation : evaluations) {
                    if (evaluation != null && StringUtils.isNotBlank(evaluation.getUserIcon())) {
                        evaluation.setUserIcon(ossPicture
                                .compressionfixation(evaluation.getUserIcon()));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return evaluations;
    }
}
