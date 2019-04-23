package com.group7.edu.controller;

import com.github.pagehelper.Page;
import com.group7.edu.dto.SysOrderDto;
import com.group7.edu.entity.SysCourse;
import com.group7.edu.service.SysCourseService;
import com.group7.edu.service.SysOrderService;
import com.group7.edu.utils.PageEntity;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 22:46 2019/4/11
 * @Modified By:
 */
@RestController
public class SysCourseController {
    @Resource
    private SysCourseService sysCourseService;

    @RequestMapping("/sys/my_courses")
    public ResponseEntity myCourses(@RequestBody SysCourse sysCourse){
        List<SysCourse> l = sysCourseService.findById(sysCourse);
        return new ResponseEntity(new PageEntity<>(l), HttpStatus.OK);
    }

}
