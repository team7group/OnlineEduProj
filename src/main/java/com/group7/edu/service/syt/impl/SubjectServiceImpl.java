package com.group7.edu.service.syt.impl;

import com.group7.edu.entity.SysSubject;
import com.group7.edu.mapper.syt.SysSubjectMapperDTO;
import com.group7.edu.service.syt.SubjectService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("subjectServiceImpl")
public class SubjectServiceImpl implements SubjectService {

    @Resource
    private SysSubjectMapperDTO sysSubjectMapperDTO;

    @Override
    public ResultData subjectList() {

        List<SysSubject> list =  sysSubjectMapperDTO.selectAll();

        return ResultData.isSuccess().put("list",list);
    }
}
