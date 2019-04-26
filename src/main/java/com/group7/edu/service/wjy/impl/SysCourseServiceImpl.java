package com.group7.edu.service.wjy.impl;

import com.group7.edu.entity.SysCourse;
import com.group7.edu.mapper.wjy.SysCourseMapperWjy;
import com.group7.edu.service.wjy.SysCourseService;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 22:54 2019/4/11
 * @Modified By:
 */
@Service("sysCourseServiceWjy")
public class SysCourseServiceImpl implements SysCourseService {
    @Resource
    private SysCourseMapperWjy sysCourseMapperWjy;
    //通过课程查id
    @Override
    public List<SysCourse> findById() {
        return sysCourseMapperWjy.find(ShiroUtils.getUserId());
    }
}
