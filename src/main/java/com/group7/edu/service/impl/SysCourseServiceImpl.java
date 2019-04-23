package com.group7.edu.service.impl;

import com.group7.edu.entity.SysCourse;
import com.group7.edu.mapper.SysCourseMapper;
import com.group7.edu.service.SysCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 22:54 2019/4/11
 * @Modified By:
 */
@Service
public class SysCourseServiceImpl implements SysCourseService {
    @Resource
    private SysCourseMapper sysCourseMapper;
    //通过课程查id
    @Override
    public List<SysCourse> findById(SysCourse id) {
        return sysCourseMapper.find(id);
    }
}
