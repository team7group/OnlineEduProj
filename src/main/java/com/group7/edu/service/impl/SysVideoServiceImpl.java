package com.group7.edu.service.impl;

import com.group7.edu.entity.SysVideo;
import com.group7.edu.mapper.SysVideoMapper;
import com.group7.edu.service.SysVideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 8:51 2019/4/17
 * @Modified By:
 */
@Service
public class SysVideoServiceImpl implements SysVideoService {
    @Resource
    private SysVideoMapper sysVideoMapper;

    @Override
    public List<SysVideo> findMyCollections(SysVideo sysVideo) {
        return sysVideoMapper.findMyCollections(sysVideo);
    }
}
