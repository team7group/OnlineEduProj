package com.group7.edu.controller;

import com.group7.edu.dto.SysCourseDTO;
import com.group7.edu.service.SysCourseService;
import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SysCourseController {

    @Resource
    private SysCourseService sysCourseService;

    @RequestMapping("/course/detail/{id}")
    public ResultData findCourseDetail(@PathVariable("id") Integer id) {
        SysCourseDTO courseDetails = sysCourseService.findCourseDetails(id);
        if (courseDetails == null) {
            return ResultData.isFailure("获取失败");
        }
        return ResultData.isSuccess().put("detail", courseDetails);
    }

}
