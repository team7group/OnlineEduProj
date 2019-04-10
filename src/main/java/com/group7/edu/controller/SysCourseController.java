package com.group7.edu.controller;

import com.group7.edu.mapper.SysCourseMapper;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author default
 * @date 2019/4/9
 */
@RestController
public class SysCourseController {
    @Resource
    private SysCourseMapper sysCourseMapper;
}
