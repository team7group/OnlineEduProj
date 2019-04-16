package com.group7.edu.service.impl;

import com.group7.edu.entity.*;
import com.group7.edu.mapper.*;
import com.group7.edu.service.MultiListQueriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author default
 * @date 2019/4/11
 */

@Service
public class MultiListQueriesServiceImpl implements MultiListQueriesService {
    @Resource
    private MultiListQueriesMapper multiListQueriesMapper;
    @Resource
    private SysCourseMapper sysCourseMapper;
    @Resource
    private SysNewsMapper sysNewsMapper;
    @Resource
    private SysIndustryInfoMapper sysIndustryInfoMapper;
    @Resource
    private SysSubjectMapper sysSubjectMapper;

    @Override
    public List<MultiListQueries> multiListQueries(MultiListQueries multiListQueries) {
        return multiListQueriesMapper.multiListQueries(multiListQueries);
    }

    @Override
    public List<SysCourse> courseList(SysCourse course) {
        return sysCourseMapper.courseList(course);
    }

    @Override
    public List<SysNews> newsList(SysNews news) {
        return sysNewsMapper.newsList(news);
    }

    @Override
    public List<SysIndustryInfo> infoList(SysIndustryInfo info) {
        return sysIndustryInfoMapper.infoList(info);
    }

    @Override
    public List<SysSubject> subjectList(SysSubject subject) {
        return sysSubjectMapper.subjectList(subject);
    }
}
