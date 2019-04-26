package com.group7.edu.service.wjy.impl;

import com.group7.edu.entity.SysVideo;
import com.group7.edu.mapper.wjy.SysVideoMapperWjy;
import com.group7.edu.service.wjy.SysVideoService;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 8:51 2019/4/17
 * @Modified By:
 */
@Service("sysVideoServiceWjy")
public class SysVideoServiceImpl implements SysVideoService {
    @Resource
    private SysVideoMapperWjy sysVideoMapperWjy;

    @Override
    public List<SysVideo> findMyCollections() {
        return sysVideoMapperWjy.findMyCollections(ShiroUtils.getUserId());
    }
}
