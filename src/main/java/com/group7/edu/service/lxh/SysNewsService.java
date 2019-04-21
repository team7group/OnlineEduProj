package com.group7.edu.service.lxh;

import com.group7.edu.entity.lxh.SysNews;

import java.util.List;

/**
 * @author default
 * @date 2019/4/10
 */
public interface SysNewsService {
    /**
     * 查询新闻集合
     */
    List<SysNews> selectAllSysNews(SysNews sysNews);
}
