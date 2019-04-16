package com.group7.edu.controller;

import com.group7.edu.entity.SysHomepageIntroduce;
import com.group7.edu.service.SysHomepageIntroduceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 
 *
 * @author default
 * @date   2019/04/15
 */
@RestController
public class SysHomepageIntroduceController {
    @Resource
    private SysHomepageIntroduceService sysHomepageIntroduceService;

    @RequestMapping("/home/introduce/id")
    public SysHomepageIntroduce findSysIntroduce(Integer id) {
        SysHomepageIntroduce sysHomepageIntroduce1 = sysHomepageIntroduceService.selectByPrimaryKey(id);
        return sysHomepageIntroduce1;
    }

}