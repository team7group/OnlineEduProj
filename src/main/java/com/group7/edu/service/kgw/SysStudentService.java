package com.group7.edu.service.kgw;

import com.group7.edu.dto.SysStudentDTO;
import com.group7.edu.entity.SysStudent;
import com.group7.edu.utils.ResultData;

public interface SysStudentService {
    SysStudent login(String phoneOrEmail);

    ResultData register(SysStudentDTO sysStudentDTO);

    ResultData resetPasswordSelectStudent(SysStudent sysStudent);

    ResultData resetPassword(SysStudentDTO sysStudentDTO);

}
