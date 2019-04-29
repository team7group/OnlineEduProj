package com.group7.edu.service.kgw.impl;

import com.group7.edu.entity.SysContactWay;
import com.group7.edu.mapper.SysContactWayMapper;
import com.group7.edu.service.kgw.SysContactWayService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysContactWayServiceImpl implements SysContactWayService {
    @Resource
    SysContactWayMapper sysContactWayMapper;
    @Override
    public ResultData contactCommit(SysContactWay sysContactWay) {
        if(sysContactWay.getSchool()==null){
            return ResultData.isFailure("学校不能为空");
        }
        if(sysContactWay.getName()==null){
            return ResultData.isFailure("姓名不能为空");
        }
        if(sysContactWay.getPhone()==null){
            return ResultData.isFailure("联系电话不能为空");
        }
        if(sysContactWay.getService()==null){
            return ResultData.isFailure("服务不能为空");
        }
        if(sysContactWay.getFocus()==null){
            return ResultData.isFailure("关注点不能为空");
        }
        if(sysContactWay.getBugget()==null){
            return ResultData.isFailure("预算不能为空");
        }
        int i = sysContactWayMapper.insert(sysContactWay);
        return i<1?ResultData.isFailure("服务器繁忙请稍后再试"):ResultData.isSuccess("添加成功");
    }
}
