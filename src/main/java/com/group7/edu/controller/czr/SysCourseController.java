package com.group7.edu.controller.czr;

import com.alibaba.fastjson.JSON;
import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.dto.SysPersonCourse;
import com.group7.edu.entity.SysAnswerQuestion;
import com.group7.edu.service.czr.SysCourseService;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(value = "*", allowCredentials = "true")
public class SysCourseController {

    @Resource
    private SysCourseService sysCourseService;

    @RequestMapping("/course/detail/{id}")
    public ResultData findCourseDetail(@PathVariable("id") Integer id) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysCourseController.findCourseDetail");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        if (id == null || id <= 0) {
            return ResultData.isFailure("参数非法");
        }
        SysCourseDTO courseDetails = sysCourseService.findCourseDetails(id);
        if (courseDetails == null) {
            return ResultData.isFailure("获取失败");
        }
        ResultData detail = ResultData.isSuccess().put("detail", courseDetails);
        detail.put("qa", sysCourseService.findQaByPage(0, 100));
        detail.put("syllabus", sysCourseService.findSyllabus(id));
        detail.put("evaluation", sysCourseService.findCourseEvaluationById(id, 0, 100));
        return detail;

    }

    @RequestMapping("/course/qa/get")
    public ResultData findQaByPage(Integer courseId, Integer page, Integer pageSize) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysCourseController.findQaByPage");
        System.out.println("courseId = [" + courseId + "], page = [" + page + "], pageSize = [" + pageSize + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        if (courseId == null || page == null || pageSize == null) {
            return ResultData.isFailure("参数非法");
        }
        List<SysAnswerQuestion> qaList = sysCourseService.findQaByPage(page, pageSize);
        Integer qaCount = sysCourseService.findQaCount(courseId);
        if (qaCount == null) {
            return ResultData.isFailure("未能成功获取Qa总数");
        }
        if (qaCount == 0) {
            return ResultData.isSuccess().put("count", 0).put("list", "{}");
        }
        if (qaList == null) {
            return ResultData.isFailure("未能获取Qa列表");
        }
        return ResultData.isSuccess().put("count", qaCount).put("list", qaList);
    }

    @RequestMapping("/course/syllabus/get/{id}")
    public ResultData findSyllabusById(@PathVariable("id") Integer id) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysCourseController.findSyllabusById");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        if (id == null || id <= 0) {
            return ResultData.isFailure("参数非法");
        }
        String syllabus = sysCourseService.findSyllabus(id);
        if (syllabus == null) {
            return ResultData.isFailure("未查询到相关信息").put("syllabus", "{}");
        }
        return ResultData.isSuccess().put("syllabus", JSON.parseArray(syllabus));
    }

    @RequestMapping("/course/evaluation/get")
    public ResultData findEvaluationById(Integer courseId, Integer page, Integer pageSize) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysCourseController.findEvaluationById");
        System.out.println("courseId = [" + courseId + "], page = [" + page + "], pageSize = [" + pageSize + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        if (courseId == null || courseId <= 0 || page == null || pageSize == null) {
            return ResultData.isFailure("参数非法");
        }
        return sysCourseService.findCourseEvaluationById(courseId, page, pageSize);
    }

    @RequestMapping("/course/my_courses")
    public ResultData findMyCourseByUid(Integer pageNum, Integer pageSize) {
        Integer uid = ShiroUtils.getUserId();
        if (uid == null) {
            return ResultData.isFailure("未登录");
        }
        Integer totalPage = sysCourseService.getPersonalTotalPage(uid, pageSize);
        if (totalPage == null) {
            return ResultData.isFailure("失败");
        }
        List<SysPersonCourse> list = sysCourseService.getPersonalCourse(uid, pageNum, pageSize);
        if (list == null) {
            return ResultData.isFailure("失败2");
        }
        return ResultData.isSuccess().put("totalPage", totalPage).put("list", list);
    }

    @RequestMapping("/cou/cou_tea")
    public ResultData findCoursesTeachersInfo() {
        return sysCourseService.findCoursesInfo();
    }
}
