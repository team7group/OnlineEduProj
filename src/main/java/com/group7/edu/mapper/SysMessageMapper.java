package com.group7.edu.mapper;

import com.group7.edu.entity.SysMessage;
import com.group7.edu.entity.SysMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMessageMapper {
    long countByExample(SysMessageExample example);

    int deleteByExample(SysMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMessage record);

    int insertSelective(SysMessage record);

    List<SysMessage> selectByExample(SysMessageExample example);

    SysMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMessage record, @Param("example") SysMessageExample example);

    int updateByExample(@Param("record") SysMessage record, @Param("example") SysMessageExample example);

    int updateByPrimaryKeySelective(SysMessage record);

    int updateByPrimaryKey(SysMessage record);
}