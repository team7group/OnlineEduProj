package com.group7.edu.service.hky;

import com.group7.edu.utils.ResultData;

public interface SysVideoService {
    ResultData chapter(int course);

    ResultData part(int nowPage, int number, int course, int capter);
}
