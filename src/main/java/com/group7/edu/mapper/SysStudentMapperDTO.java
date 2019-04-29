package com.group7.edu.mapper;

import com.group7.edu.dto.SysStudentDTO;
import com.group7.edu.entity.SysStudent;

public interface SysStudentMapperDTO {
    SysStudent selectByPrimaryKey(String phoneOrEmail);
    int updateByPrimaryKeySelective(SysStudentDTO sysStudentDTO);
}
