package com.group7.edu.mapper;

import com.group7.edu.entity.Syllabus;
import com.group7.edu.entity.SyllabusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyllabusMapper {
    long countByExample(SyllabusExample example);

    int deleteByExample(SyllabusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Syllabus record);

    int insertSelective(Syllabus record);

    List<Syllabus> selectByExampleWithBLOBs(SyllabusExample example);

    List<Syllabus> selectByExample(SyllabusExample example);

    Syllabus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Syllabus record, @Param("example") SyllabusExample example);

    int updateByExampleWithBLOBs(@Param("record") Syllabus record, @Param("example") SyllabusExample example);

    int updateByExample(@Param("record") Syllabus record, @Param("example") SyllabusExample example);

    int updateByPrimaryKeySelective(Syllabus record);

    int updateByPrimaryKeyWithBLOBs(Syllabus record);
}