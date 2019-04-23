package com.group7.edu.controller.czr;

import com.group7.edu.entity.SysBarrage;
import com.group7.edu.service.czr.SysBarrageService;
import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SysBarrageController {

    @Resource
    private SysBarrageService sysBarrageService;

    @RequestMapping("/barrage/getEx")
    public ResultData getBarrageEx(Integer videoId, Integer progress, Integer duration, Integer offset, Integer length) {
        List<SysBarrage> barrages = sysBarrageService.findByIdDuration(videoId, progress, duration, offset, length);
        if (barrages == null) {
            return ResultData.isFailure("获取失败");
        }
        return ResultData.isSuccess().put("barrage", barrages);
    }

    @RequestMapping("/barrage/get")
    public ResultData getBarrage(Integer videoId, Integer progress) {
        List<SysBarrage> barrages = sysBarrageService.findByIdDuration(videoId, progress, 30, 0, 1000);
        if (barrages == null) {
            return ResultData.isFailure("获取失败");
        }
        return ResultData.isSuccess().put("barrage", barrages);
    }

    @RequestMapping("/barrage/add")
    public ResultData addBarrage(@RequestBody SysBarrage barrage) {
        if (barrage == null) {
            return ResultData.isFailure("参数错误");
        }
        if (sysBarrageService.add(barrage) <= 0) {
            return ResultData.isFailure("插入失败");
        }
        return ResultData.isSuccess("插入成功");
    }

}
