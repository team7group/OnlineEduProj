package com.group7.edu.controller.kgw;

import com.group7.edu.entity.SysContactWay;
import com.group7.edu.service.kgw.SysAdService;
import com.group7.edu.service.kgw.SysContactWayService;
import com.group7.edu.service.kgw.SysFocusService;
import com.group7.edu.service.kgw.SysServiceTypeService;
import com.group7.edu.utils.ResultData;
import org.apache.commons.lang3.StringUtils;
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
        if(StringUtils.isBlank(page)){
            return ResultData.isFailure("页数不能为空");
        }
        return sysAdService.selectByPage(page);
    }

    //提交
    @RequestMapping("/sys/sysContactWay/commit")
    public ResultData commit(@RequestBody SysContactWay sysContactWay){
        if(StringUtils.isBlank(sysContactWay.getName())){
            return ResultData.isFailure("姓名不能为空");
        }
        if(StringUtils.isBlank(sysContactWay.getPhone())){
            return ResultData.isFailure("手机号不能为空");
        }
        if(StringUtils.isBlank(sysContactWay.getSchool())){
            return ResultData.isFailure("学校不能为空");
        }
        if(sysContactWay.getService()==null||sysContactWay.getService()<0){
            return ResultData.isFailure("需要的服务不能为空");
        }
        if(sysContactWay.getFocus()==null||sysContactWay.getFocus()<0){
            return ResultData.isFailure("关注点不能为空");
        }
        if(sysContactWay.getBugget()==null||sysContactWay.getBugget()<0){
            return ResultData.isFailure("预算不能为空");
        }

        return sysContactWayService.contactCommit(sysContactWay);
    }
}
