package com.group7.edu.mapper;

import com.group7.edu.entity.SysStudent;
import com.group7.edu.entity.SysStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStudentMapper {

    long countByExample(SysStudentExample example);

    int deleteByExample(SysStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysStudent record);

    int insertSelective(SysStudent record);

    List<SysStudent> selectByExample(SysStudentExample example);
    SysStudent selectStudentByPrimaryKey(Integer id);
    SysStudent selectByPrimaryKey(Integer id);

    int updateIcon(SysStudent record);
    int updateByExampleSelective(@Param("record") SysStudent record, @Param("example") SysStudentExample example);

    int updateByExample(@Param("record") SysStudent record, @Param("example") SysStudentExample example);

    int updateByPrimaryKeySelective(SysStudent record);

    int updateByPrimaryKey(SysStudent record);
    int updatePwd(SysStudent record);
    int updateWechat(SysStudent record);
    int updateQQ(SysStudent record);
    long findCheckinDays(long id);
    int updateCheckinDays(SysStudent record);
}