package com.group7.edu.controller.syt;

import com.group7.edu.entity.syt.FeedBackDTO;
import com.group7.edu.service.syt.FeedBackService;
import com.group7.edu.service.syt.SubjectService;
import com.group7.edu.utils.ResultData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AdviceController {

    @Resource
    private SubjectService subjectService;

    @Resource
    private FeedBackService feedBackService;

    @RequestMapping("/sys/advice/subInfo")
    public ResultData subList(){
        return subjectService.subjectList();
    }

    @RequestMapping("/sys/advice/submit")
    public ResultData submit(@RequestBody FeedBackDTO feedBackDTO){
        if(feedBackDTO.getType() == null){
            return ResultData.isFailure("投诉建议类型不能为空");
        }if(feedBackDTO.getSubject() == null){
            return ResultData.isFailure("科目名称不能为空");
        }if(feedBackDTO.getDepartment() == null){
            return ResultData.isFailure("部门名称不能为空");
        }if(StringUtils.isBlank(feedBackDTO.getFeedbackText())){
            return ResultData.isFailure("反馈内容不能为空");
        }if(StringUtils.isBlank(feedBackDTO.getImage())){
            feedBackDTO.setImage("no image");
        }
        return feedBackService.feedBack(feedBackDTO);
    }

}
