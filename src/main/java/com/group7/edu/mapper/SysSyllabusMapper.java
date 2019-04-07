package com.group7.edu.mapper;

import com.group7.edu.entity.SysSyllabus;
import com.group7.edu.entity.SysSyllabusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSyllabusMapper {
    long countByExample(SysSyllabusExample example);

    int deleteByExample(SysSyllabusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysSyllabus record);

    int insertSelective(SysSyllabus record);

    List<SysSyllabus> selectByExampleWithBLOBs(SysSyllabusExample example);

    List<SysSyllabus> selectByExample(SysSyllabusExample example);

    SysSyllabus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysSyllabus record, @Param("example") SysSyllabusExample example);

    int updateByExampleWithBLOBs(@Param("record") SysSyllabus record, @Param("example") SysSyllabusExample example);

    int updateByExample(@Param("record") SysSyllabus record, @Param("example") SysSyllabusExample example);

    int updateByPrimaryKeySelective(SysSyllabus record);

    int updateByPrimaryKeyWithBLOBs(SysSyllabus record);
}