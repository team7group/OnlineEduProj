package com.group7.edu.mapper.zxl;

import com.group7.edu.entity.SysStudent;

public interface SysStudentMapperZxl {

    int deleteByPrimaryKey(Integer id);

    int insert(SysStudent record);

    int insertSelective(SysStudent record);

    SysStudent selectStudentByPrimaryKey(Integer id);
    SysStudent selectByPrimaryKey(Integer id);

    int updateIcon(SysStudent record);
    int updateByPrimaryKeySelective(SysStudent record);

    int updateByPrimaryKey(SysStudent record);
    int updatePwd(SysStudent record);
    int updateWechat(SysStudent record);
    int updateQQ(SysStudent record);
    long findCheckinDays(long id);
    int updateCheckinDays(SysStudent record);
}