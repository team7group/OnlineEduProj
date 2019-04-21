package com.group7.edu.service.impl;

import com.group7.edu.entity.SysSubject;
import com.group7.edu.mapper.SysSubjectMapper;
import com.group7.edu.mapper.SysSubjectMapperDTO;
import com.group7.edu.service.SubjectService;
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
