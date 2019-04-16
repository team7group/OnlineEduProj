package com.group7.edu.controller;

import com.group7.edu.entity.SysAboutus;
import com.group7.edu.service.SysAboutusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author default
 * @date 2019/4/15
 */
@RestController
public class SysAboutusController {
    @Resource
    private SysAboutusService sysAboutusService;

    @RequestMapping("/home/about/id")
    public SysAboutus findSysAboutus(Integer id) {
        SysAboutus sysAboutus1 = sysAboutusService.selectByPrimaryKey(id);
        return sysAboutus1;
    }

}
