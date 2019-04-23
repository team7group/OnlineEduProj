package com.group7.edu.service.lxh.impl;

import com.group7.edu.entity.lxh.SysNews;
import com.group7.edu.mapper.lxh.SysNewsMapperLxh;
import com.group7.edu.service.lxh.SysNewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author default
 * @date 2019/4/10
 */
@Service("sysNewsServiceLxh")
public class SysNewsServiceImpl implements SysNewsService {
    @Resource(name = "sysNewsMapperLxh")
    private SysNewsMapperLxh sysNewsMapper;

    @Override
    public List<SysNews> selectAllSysNews(SysNews sysNews) {
        return sysNewsMapper.selectAllSysNews(sysNews);
    }
}
