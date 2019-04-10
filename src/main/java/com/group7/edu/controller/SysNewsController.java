package com.group7.edu.controller;

import com.group7.edu.mapper.SysNewsMapper;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author default
 * @date 2019/4/10
 */
@RestController
public class SysNewsController {
    @Resource
    private SysNewsMapper sysNewsMapper;

}
