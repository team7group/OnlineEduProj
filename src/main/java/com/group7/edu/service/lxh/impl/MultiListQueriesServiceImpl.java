package com.group7.edu.service.lxh.impl;

import com.group7.edu.entity.lxh.*;
import com.group7.edu.mapper.lxh.*;
import com.group7.edu.service.lxh.MultiListQueriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author default
 * @date 2019/4/11
 */

@Service("multiListQueriesServiceLxh")
public class MultiListQueriesServiceImpl implements MultiListQueriesService {
    @Resource
    private MultiListQueriesMapperLxh multiListQueriesMapperLxh;
    @Resource
    private SysCourseMapperLxh sysCourseMapperLxh;
    @Resource
    private SysNewsMapperLxh sysNewsMapperLxh;
    @Resource
    private SysIndustryInfoMapperLxh sysIndustryInfoMapperLxh;
    @Resource
    private SysSubjectMapperLxh sysSubjectMapperLxh;

    @Override
    public List<MultiListQueries> multiListQueries(MultiListQueries multiListQueries) {
        return multiListQueriesMapperLxh.multiListQueries(multiListQueries);
    }

    @Override
    public List<SysCourse> courseList(SysCourse course) {
        return sysCourseMapperLxh.courseList(course);
    }

    @Override
    public List<SysNews> newsList(SysNews news) {
        return sysNewsMapperLxh.newsList(news);
    }

    @Override
    public List<SysIndustryInfo> infoList(SysIndustryInfo info) {
        return sysIndustryInfoMapperLxh.infoList(info);
    }

    @Override
    public List<SysSubject> subjectList(SysSubject subject) {
        return sysSubjectMapperLxh.subjectList(subject);
    }
}
