package com.group7.edu.mapper;

import com.group7.edu.entity.SysNews;
import com.group7.edu.entity.SysNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNewsMapper {
    long countByExample(SysNewsExample example);

    int deleteByExample(SysNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysNews record);

    int insertSelective(SysNews record);

    List<SysNews> selectByExampleWithBLOBs(SysNewsExample example);

    List<SysNews> selectByExample(SysNewsExample example);

    SysNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysNews record, @Param("example") SysNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") SysNews record, @Param("example") SysNewsExample example);

    int updateByExample(@Param("record") SysNews record, @Param("example") SysNewsExample example);

    int updateByPrimaryKeySelective(SysNews record);

    int updateByPrimaryKeyWithBLOBs(SysNews record);

    int updateByPrimaryKey(SysNews record);
}