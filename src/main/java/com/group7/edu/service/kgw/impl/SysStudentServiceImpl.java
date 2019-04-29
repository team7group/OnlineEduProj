package com.group7.edu.service.kgw.impl;

import com.group7.edu.dto.SysStudentDTO;
import com.group7.edu.entity.SysStudent;
import com.group7.edu.mapper.SysStudentMapper;
import com.group7.edu.mapper.SysStudentMapperDTO;
import com.group7.edu.service.kgw.SysStudentService;
import com.group7.edu.utils.PasswordUtils;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sysStudentServiceKgw")
public class SysStudentServiceImpl implements SysStudentService {

    @Resource
    SysStudentMapper sysStudentMapper;
    @Resource
    SysStudentMapperDTO sysStudentMapperDTO;


    @Override
    public SysStudent login(String phoneOrEmail) {
        return sysStudentMapperDTO.selectByPrimaryKey(phoneOrEmail);
    }

    @Override
    public ResultData register(SysStudentDTO sysStudentDTO) {


        //获得加密后的密码
        String password = sysStudentDTO.getPassword();
        String salt = PasswordUtils.genSalt();
        String passwordHash = PasswordUtils.md5Hash(password, salt);

        //将salt和加密后的密码存入对象中
        sysStudentDTO.setPasswordSalt(salt);
        sysStudentDTO.setPasswordHash(passwordHash);
        sysStudentDTO.setBanned(false);
        sysStudentDTO.setCheckinDays(0);

        int i = sysStudentMapper.insert(sysStudentDTO);
        return i>0?ResultData.isSuccess("注册成功"):ResultData.isFailure("注册失败");
    }

    //找回密码时判断邮箱是否存在
    @Override
    public ResultData resetPasswordSelectStudent(SysStudent sysStudent) {
        SysStudentDTO sysStudentDTO = new SysStudentDTO();
        sysStudentDTO.setPhoneOrEmail(sysStudent.getEmail());
        SysStudent sysStudent1 = sysStudentMapperDTO.selectByPrimaryKey(sysStudentDTO.getPhoneOrEmail());
        if(sysStudent1==null){
            return ResultData.isFailure();
        }
        return ResultData.isSuccess().put("sysStudent",sysStudent1);
    }

    @Override
    public ResultData resetPassword(SysStudentDTO sysStudentDTO) {

        String password = sysStudentDTO.getPassword();
        String salt = PasswordUtils.genSalt();
        String passwordHash = PasswordUtils.md5Hash(password, salt);

        sysStudentDTO.setPasswordSalt(salt);
        sysStudentDTO.setPasswordHash(passwordHash);

        int i = sysStudentMapperDTO.updateByPrimaryKeySelective(sysStudentDTO);

        return i>0?ResultData.isSuccess("找回成功"):ResultData.isFailure("服务器繁忙请稍后再试");
    }
}
