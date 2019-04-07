package com.group7.edu.mapper;

import com.group7.edu.entity.SysContactWay;
import com.group7.edu.entity.SysContactWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysContactWayMapper {
    long countByExample(SysContactWayExample example);

    int deleteByExample(SysContactWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysContactWay record);

    int insertSelective(SysContactWay record);

    List<SysContactWay> selectByExample(SysContactWayExample example);

    SysContactWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysContactWay record, @Param("example") SysContactWayExample example);

    int updateByExample(@Param("record") SysContactWay record, @Param("example") SysContactWayExample example);

    int updateByPrimaryKeySelective(SysContactWay record);

    int updateByPrimaryKey(SysContactWay record);
}