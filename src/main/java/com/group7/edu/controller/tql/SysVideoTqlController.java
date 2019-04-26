package com.group7.edu.controller.tql;

import com.group7.edu.entity.tql.SysComment;
import com.group7.edu.entity.tql.SysVideo;
import com.group7.edu.service.tql.SysCommentService;
import com.group7.edu.service.tql.SysVideoService;
import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class SysVideoTqlController {

    @Resource
    private SysVideoService sysVideoService;
    @Resource
    private SysCommentService sysCommentService;

    @RequestMapping("/sys/video/spot")
    public ResultData spot(int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysVideoTqlController.spot");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysVideoService.spotFabulous(id);
    }
    @RequestMapping("/sys/video/share")
    public ResultData share(SysVideo sysVideo, int time){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysVideoTqlController.share");
        System.out.println("sysVideo = [" + sysVideo + "], time = [" + time + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysVideoService.share(sysVideo,time);
    }
    @RequestMapping("/sys/video/preservation")
    public ResultData preservation(int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysVideoTqlController.preservation");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysVideoService.preservation(id);
    }
    @RequestMapping("/sys/video/relate")
    public ResultData relatedVideos(int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysVideoTqlController.relatedVideos");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysVideoService.relatedVideos(id);
    }
    @RequestMapping("/sys/video/comment")
    public ResultData comment(int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysVideoTqlController.comment");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysCommentService.commentaryInformation(id);
    }
    @RequestMapping("/sys/video/addcomment")
    public ResultData addComment(SysComment sysComment){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysVideoTqlController.addComment");
        System.out.println("sysComment = [" + sysComment + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysCommentService.addComments(sysComment);
    }
}
