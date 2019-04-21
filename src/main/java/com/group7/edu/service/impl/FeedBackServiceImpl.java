package com.group7.edu.service.impl;

import com.group7.edu.entity.FeedBackDTO;
import com.group7.edu.entity.SysFeedback;
import com.group7.edu.mapper.SysFeedbackMapper;
import com.group7.edu.service.FeedBackService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("FeedBackServiceImpl")
public class FeedBackServiceImpl implements FeedBackService {


    @Resource
    private SysFeedbackMapper sysFeedbackMapper;

    @Override
    public ResultData feedBack(FeedBackDTO feedBackDTO) {
        SysFeedback sysFeedback = new FeedBackDTO();

        sysFeedback.setType(feedBackDTO.getType());
        sysFeedback.setSubject(feedBackDTO.getSubject());
        sysFeedback.setDepartment(feedBackDTO.getDepartment());
        sysFeedback.setImageUrl(feedBackDTO.getImage());
        sysFeedback.setFeedbackText(feedBackDTO.getFeedbackText());
        int n = sysFeedbackMapper.insert(sysFeedback);
        if(n == 0){
            return ResultData.isFailure("反馈建议上传失败");
        }
        return ResultData.isSuccess("反馈成功，感谢你的反馈");
    }
}
