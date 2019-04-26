package com.group7.edu.service.tql.impl;

import com.group7.edu.entity.tql.SysComment;
import com.group7.edu.mapper.tql.SysCommentTqlMapper;
import com.group7.edu.service.tql.SysCommentService;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SysCommentServiceImpl implements SysCommentService {

    @Resource
    private SysCommentTqlMapper sysCommentTqlMapper;

    @Override
    public ResultData commentaryInformation(int vid) {
        List<SysComment> sysComments = sysCommentTqlMapper.commentaryInformation(vid);
        if (sysComments!=null){
            return (ResultData) ResultData.isSuccess().put("comment",sysComments);
        }
        return ResultData.isFailure("查看评论失败");
    }

    @Override
    public ResultData addComments(SysComment sysComment) {
        sysComment.setUid(ShiroUtils.getUserId());
        sysComment.setCreatedTime(new Date());
        int i = sysCommentTqlMapper.addComments(sysComment);
        if (i>0){
            return ResultData.isSuccess();
        }
        return ResultData.isFailure();
    }
}
