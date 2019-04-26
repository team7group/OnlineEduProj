package com.group7.edu.service.tql;

import com.group7.edu.entity.tql.SysVideo;
import com.group7.edu.utils.ResultData;


public interface SysVideoService {
    ResultData spotFabulous(int id);
    ResultData share(SysVideo sysVideo, int time);
    ResultData preservation(int id);
    ResultData relatedVideos(int capter);
}
