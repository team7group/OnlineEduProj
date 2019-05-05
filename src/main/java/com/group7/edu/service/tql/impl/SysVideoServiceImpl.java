package com.group7.edu.service.tql.impl;

import com.group7.edu.entity.tql.SysFavorite;
import com.group7.edu.entity.tql.SysNetDiskFile;
import com.group7.edu.entity.tql.SysVideo;
import com.group7.edu.mapper.tql.SysFavoriteTqlMapper;
import com.group7.edu.mapper.tql.SysNetDiskFileTqlMapper;
import com.group7.edu.mapper.tql.SysVideoTqlMapper;
import com.group7.edu.osshandle.OssSource;
import com.group7.edu.service.tql.SysVideoService;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "sysVideoServiceImpl")
public class SysVideoServiceImpl implements SysVideoService {
    @Resource
    private SysVideoTqlMapper sysVideoTqlMapper;
    @Resource
    private OssSource ossSource;
    @Resource
    private SysNetDiskFileTqlMapper sysNetDiskFileTqlMapper;
    @Resource
    private SysFavoriteTqlMapper sysFavoriteTqlMapper;
    @Override
    public ResultData spotFabulous(int id) {
        int i = sysVideoTqlMapper.spotFabulous(id);
        if (i>0){
            return ResultData.isSuccess();
        }
        return ResultData.isFailure("点赞失败");
    }

    @Override
    public ResultData share(SysVideo sysVideo, int time) {
        String url = ossSource.onlinePreview(sysVideo.getFileUuid(), sysVideo.getName(), time);
        SysNetDiskFile sysNetDiskFile = new SysNetDiskFile();
        sysNetDiskFile.setUrl(url);
        sysNetDiskFile.setFileuuid(sysVideo.getFileUuid());
        sysNetDiskFile.setFilename(sysVideo.getName());
        int share = sysVideoTqlMapper.share(sysVideo.getId());
        if (share>0){
            return (ResultData) ResultData.isSuccess().put("share",sysNetDiskFile);
        }
        return ResultData.isFailure("分享失败");
    }

    @Override
    public ResultData preservation(int  id) {
        SysFavorite sysFavorite1 = sysFavoriteTqlMapper.videoSelect(ShiroUtils.getUserId(), id);
        if (sysFavorite1!=null){
            return ResultData.isFailure("该视频已收藏过");
        }
        SysFavorite sysFavorite = new SysFavorite();
        sysFavorite.setUid(ShiroUtils.getUserId());
        sysFavorite.setCreatedTime(new Date());
        sysFavorite.setVideoId(id);
        int i = sysFavoriteTqlMapper.insertSelective(sysFavorite);
        int preservation = sysVideoTqlMapper.preservation(id);
        if (preservation>0&&i>0){
            return ResultData.isSuccess();
        }
        return ResultData.isFailure("收藏失败");
    }

//    @Override
//    public ResultData relatedVideos(int capter) {
//        SysVideo sysVideos = sysVideoTqlMapper.relatedVideos(capter);
//        if (sysVideos!=null){
//            List<SysVideo> chapterVideos = sysVideoTqlMapper.chapterVideos(sysVideos.getCapter());
//            for (SysVideo chapterVideo : chapterVideos) {
//                String url = ossSource.onlinePreview(chapterVideo.getFileUuid(), chapterVideo.getName(), 0);
//                chapterVideo.setUrl(url);
//            }
//            if (chapterVideos!=null){
//                String url = ossSource.onlinePreview(sysVideos.getFileUuid(), sysVideos.getName(), 0);
//                Map<String,Object> map = new HashMap<>();
//                map.put("url",url);
//                map.put("chapter",chapterVideos);
//                return (ResultData) ResultData.isSuccess().put("relevant",map);
//            }
//        }
//        return ResultData.isFailure();
//    }

    @Override
    public ResultData relatedVideos(String capter) {
        List<SysVideo> sysVideos = sysVideoTqlMapper.relatedVideos(capter);
        int a = 1;
        if (sysVideos!=null){
            for (SysVideo sysVideo : sysVideos) {
                if (a==1){
                    List<SysVideo> chapterVideos = sysVideoTqlMapper.chapterVideos(sysVideo.getCapter());
                    for (SysVideo chapterVideo : chapterVideos) {
                        System.out.println(chapterVideo);
                        String url = ossSource.onlinePreview(chapterVideo.getFileUuid(), chapterVideo.getName(), 0);
                        chapterVideo.setUrl(url);
                    }
                    if (chapterVideos!=null){
                        String url = ossSource.onlinePreview(sysVideo.getFileUuid(), sysVideo.getName(), 0);
                        Map<String,Object> map = new HashMap<>();
                        map.put("url",url);
                        map.put("chapter",chapterVideos);
                        return ResultData.isSuccess().put("relevant",map);
                    }
                    a++;
                }
            }
        }
        return ResultData.isFailure();
    }
}

