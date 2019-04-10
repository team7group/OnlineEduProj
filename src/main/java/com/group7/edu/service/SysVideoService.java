package com.group7.edu.service;

import com.group7.edu.utils.ResultData;

public interface SysVideoService {
    ResultData chapter(int course);

    ResultData part(int offset,int limit,int course,int capter);
}
