package com.group7.edu.service.czr.impl;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.dto.SysCourseEvaluationDTO;
import com.group7.edu.entity.SysAnswerQuestion;
import com.group7.edu.entity.SysCourse;
import com.group7.edu.mapper.czr.SysCourseExtMapper;
import com.group7.edu.mapper.SysCourseMapper;
import com.group7.edu.osshandle.OssPicture;
import com.group7.edu.service.czr.SysCourseService;
import com.group7.edu.utils.ResultData;
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
    public ResultData findCourseEvaluationById(Integer courseId, Integer page, Integer pageSize) {
        List<SysCourseEvaluationDTO> evaluations = null;
        Integer count = null;
        page = (page - 1) * pageSize;
        try {
            count = sysCourseExtMapper.selectEvaluationCount(courseId);
            evaluations = sysCourseExtMapper.selectCourseEvaluationById(courseId, page, pageSize);
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
        if (evaluations == null || count == null) {
            return ResultData.isFailure("未查询到相关结果");
        }
        for (SysCourseEvaluationDTO evaluation : evaluations) {
            if (evaluation == null) {
                continue;
            }

            if (StringUtils.isBlank(evaluation.getEvaluationText())) {
                evaluation.setEvaluationText("超级好评");
            }

            if (StringUtils.isBlank(evaluation.getNickname())) {
                evaluation.setNickname("匿名");
                evaluation.setUserIcon(ossPicture.originalGraph("匿名头像UUID"));
            } else if (StringUtils.isBlank(evaluation.getUserIcon())) {
                evaluation.setUserIcon(ossPicture.originalGraph("默认头像UUID"));
            }
        }
        return ResultData.isSuccess().put("count", count).put("evaluations", evaluations);
    }
}
