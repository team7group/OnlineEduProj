package com.group7.edu.mapper;

import com.group7.edu.entity.SysVideo;
import com.group7.edu.entity.SysVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysVideoMapper {
    long countByExample(SysVideoExample example);

    int deleteByExample(SysVideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysVideo record);

    int insertSelective(SysVideo record);

    List<SysVideo> selectByExample(SysVideoExample example);

    SysVideo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysVideo record, @Param("example") SysVideoExample example);

    int updateByExample(@Param("record") SysVideo record, @Param("example") SysVideoExample example);

    int updateByPrimaryKeySelective(SysVideo record);

    int updateByPrimaryKey(SysVideo record);
}