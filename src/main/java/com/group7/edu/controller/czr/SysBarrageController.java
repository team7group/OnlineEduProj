package com.group7.edu.controller.czr;

import com.group7.edu.entity.SysBarrage;
import com.group7.edu.service.czr.SysBarrageService;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(value = "*", allowCredentials = "true")
public class SysBarrageController {

    @Resource
    private SysBarrageService sysBarrageService;

    @RequestMapping("/barrage/getEx")
    public ResultData getBarrageEx(Integer videoId, Integer progress, Integer duration, Integer offset, Integer length) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysBarrageController.getBarrageEx");
        System.out.println("videoId = [" + videoId + "], progress = [" + progress + "], duration = [" + duration + "], offset = [" + offset + "], length = [" + length + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        List<SysBarrage> barrages = sysBarrageService.findByIdDuration(videoId, progress, duration, offset, length);
        if (barrages == null) {
            return ResultData.isFailure("获取失败");
        }
        return ResultData.isSuccess().put("barrage", barrages);
    }

    @RequestMapping("/barrage/get")
    public ResultData getBarrage(Integer videoId, Integer progress) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysBarrageController.getBarrage");
        System.out.println("videoId = [" + videoId + "], progress = [" + progress + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        List<SysBarrage> barrages = sysBarrageService.findByIdDuration(videoId, progress, 30, 0, 1000);
        if (barrages == null) {
            return ResultData.isFailure("获取失败");
        }
        return ResultData.isSuccess().put("barrage", barrages);
    }

    @RequestMapping("/barrage/add")
    public ResultData addBarrage(@RequestBody SysBarrage barrage) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysBarrageController.addBarrage");
        System.out.println("barrage = [" + barrage + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        if (barrage == null) {
            return ResultData.isFailure("参数错误");
        }
        try {
            barrage.setUid(ShiroUtils.getUserId());
            barrage.setCreatedTime(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.isFailure("插入失败");
        }
        if (sysBarrageService.add(barrage) <= 0) {
            return ResultData.isFailure("插入失败");
        }
        return ResultData.isSuccess("插入成功");
    }

    @RequestMapping("/barrage/top500/{vid}")
    public List<String> getTop500(@PathVariable("vid") Integer vid){
        List<String> top500 = sysBarrageService.findTop500(vid);
        if (top500 == null) {
            top500 = new ArrayList<>();
        }
        return top500;
    }
}
