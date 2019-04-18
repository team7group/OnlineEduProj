package com.group7.edu.controller;


import com.group7.edu.entity.SysVideo;
import com.group7.edu.service.hky.SysCourseEvaluation;
import com.group7.edu.service.hky.SysCourseService;
import com.group7.edu.service.hky.SysGroupService;
import com.group7.edu.service.hky.SysVideoService;
import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author hky
 * 直播课程
 */
@RestController
@RequestMapping("/curriculuma")
public class SysCurriculumController {


    @Resource(name = "SysCourseServiceHky")
    SysCourseService sysCourseService;

    @Resource(name = "sysCourseEvaluationHky")
    SysCourseEvaluation sysCourseEvaluation;

    @Resource(name = "SysGroupServiceHky")
    SysGroupService sysGroupService;

    @Resource(name = "SysViewServiceHky")
    SysVideoService sysVideoService;



    //头部图片,评价分数，班级公告
    @RequestMapping("/basic/{classId}/{courseId}")
    public ResultData banner(@PathVariable("classId") Integer classId,@PathVariable("courseId") Integer courseId){
        System.out.println("访问");
        if(classId == null || classId <= 0 ){
            return ResultData.isFailure("班级Id输入有误");
        }
        if (courseId == null || courseId <= 0){
            return ResultData.isFailure("课程Id输入有误");
        }

        ResultData bannerResultData =  sysCourseService.banner(courseId);
        if (bannerResultData.getCode() == 1) {
            return ResultData.isFailure("basic查询失败");
        }

        ResultData evaluationResultData = sysCourseEvaluation.evaluation(courseId);
        if (evaluationResultData.getCode() == 1) {
            return ResultData.isFailure("basic查询失败");
        }

        ResultData noticeResultData = sysGroupService.notice(classId);
        if (noticeResultData.getCode() == 1) {
            return ResultData.isFailure("basic查询失败");
        }

        return ResultData.isSuccess().put("banner", bannerResultData).put("evaluation", evaluationResultData).put("notice", noticeResultData                   );
    }

    //查询课程章节
    @RequestMapping("/chapter/{course}")
    public ResultData chapter(@PathVariable("course") Integer course){
        if (course == null || course == 0 || course < 0 ){
            return ResultData.isFailure("章节查询失败");
        }
        return sysVideoService.chapter(course);
    }

    //查询章节的子目录
    @RequestMapping("/part")
    public ResultData part(@RequestParam(defaultValue = "1") Integer nowPage, @RequestParam(defaultValue = "10") Integer numbers, SysVideo sysVideo){
        if (nowPage < 1 ){
            return ResultData.isFailure("当前页数输入有误!");
        }
        if (numbers < 0 ){
            return ResultData.isFailure("查询的条数输入有误!");
        }
        if (sysVideo.getCourse() == null || sysVideo.getCourse() < 1){
            return ResultData.isFailure("课程编号输入有误!");
        }
        if (sysVideo.getCapter() == null || sysVideo.getCapter() < 1){
            return ResultData.isFailure("章编号输入有误!");
        }

        return sysVideoService.part(nowPage,numbers,sysVideo.getCourse(),sysVideo.getCapter());
    }

    //建议
    @RequestMapping("/advice")
    public ResultData advice(com.group7.edu.entity.SysCourseEvaluation sysCourseEvaluations){

        if(sysCourseEvaluations.getCourse() == null || sysCourseEvaluations.getCourse() == 0){
            return ResultData.isFailure("请传入正确的课程id");
        }
        if(sysCourseEvaluations.getScore() == null || sysCourseEvaluations.getScore() < 0 || sysCourseEvaluations.getScore() > 10){
            return ResultData.isFailure("评分输入有误！");
        }
        if (sysCourseEvaluations.getEvaluationText() == null){
            sysCourseEvaluations.setEvaluationText("默认好评");
        }

        return sysCourseEvaluation.advice(sysCourseEvaluations);
    }
}
