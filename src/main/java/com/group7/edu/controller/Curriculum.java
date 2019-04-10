package com.group7.edu.controller;

import com.group7.edu.entity.SysVideo;
import com.group7.edu.service.SysCourseEvaluation;
import com.group7.edu.service.SysCourseService;
import com.group7.edu.service.SysGroupService;
import com.group7.edu.service.SysVideoService;
import com.group7.edu.service.impl.SysCourseEvaluationImpl;
import com.group7.edu.utils.ResultData;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hky
 * 直播课程
 */
@RestController
@RequestMapping("/curriculum")
public class Curriculum {

    @Resource(name = "sysCourse")
    SysCourseService sysCourseService;

    @Resource(name = "sysCourseEvaluation")
    SysCourseEvaluation sysCourseEvaluation;

    @Resource(name = "sysGroup")
    SysGroupService sysGroupService;

    @Resource(name = "viewService")
    SysVideoService sysVideoService;



    //头部图片
    @RequestMapping("/banner/{id}")
    public ResultData banner(@PathVariable("id") Integer id){
        if(id == null || id == 0){
            return ResultData.isFailure("id输入有误");
        }
        System.out.println(sysCourseEvaluation);
        return sysCourseService.banner(id);
    }


    //课程评价分数
    @RequestMapping("/evaluate/{id}")
    public ResultData evaluate(@PathVariable("id") Integer id){
        System.out.println(id);
        if (id == null || id == 0){
            return ResultData.isFailure("id输入有误");
        }
        return sysCourseEvaluation.evaluation(id);
    }

    //查询课程章节
    @RequestMapping("/chapter/{course}")
    public ResultData chapter(@PathVariable("course") Integer course){
        if (course == null || course == 0 ){
            return ResultData.isFailure("章节查询失败");
        }
        return sysVideoService.chapter(course);
    }

    //查询章节的子目录
    @RequestMapping("/part")
    public ResultData part(@RequestParam(defaultValue = "1") int offset, @RequestParam(defaultValue = "10") int limit, SysVideo sysVideo){

        return sysVideoService.part(limit,offset,sysVideo.getCourse(),sysVideo.getCapter());
    }

    //公告
    @RequestMapping("/notice/{id}")
    public ResultData notice(@PathVariable("id") Integer id){
        if ( id == null || id == 0){
            return ResultData.isFailure("id有误");
        }
        return sysGroupService.notice(id);
    }

    //建议
    @RequestMapping("/advice")
    public ResultData advice(){ return null; }







}
