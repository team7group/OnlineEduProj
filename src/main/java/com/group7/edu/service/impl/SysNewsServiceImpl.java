package com.group7.edu.service.impl;

import com.group7.edu.entity.SysNews;
import com.group7.edu.mapper.SysNewsMapper;
import com.group7.edu.service.SysNewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author default
 * @date 2019/4/10
 */
@Service
public class SysNewsServiceImpl implements SysNewsService {
    @Resource
    private SysNewsMapper sysNewsMapper;

    @Override
    public List<SysNews> selectAllSysNews(SysNews sysNews) {
        return sysNewsMapper.selectAllSysNews(sysNews);
    }
}
