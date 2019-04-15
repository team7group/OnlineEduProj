package com.group7.edu.controller;

import com.group7.edu.entity.SysContactWay;
import com.group7.edu.service.SysAdService;
import com.group7.edu.service.SysContactWayService;
import com.group7.edu.service.SysFocusService;
import com.group7.edu.service.SysServiceTypeService;
import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SysContactController {

    @Resource
    SysServiceTypeService sysServiceTypeService;
    @Resource
    SysFocusService sysFocusService;
    @Resource
    SysAdService sysAdService;
    @Resource
    SysContactWayService sysContactWayService;

    //获取服务
    @RequestMapping("/sys/serviceType")
    public ResultData serviceType(){
        return sysServiceTypeService.selectServiceType();
    }

    //获取关注点
    @RequestMapping("/sys/focus")
    public ResultData focus(){
        return sysFocusService.selectAll();
    }

    //获得广告
    @RequestMapping("/sys/ad")
    public ResultData ad(String page){
        return sysAdService.selectByPage(page);
    }

    //提交
    @RequestMapping("/sys/sysContactWay/commit")
    public ResultData commit(@RequestBody SysContactWay sysContactWay){
        return sysContactWayService.contactCommit(sysContactWay);
    }
}
