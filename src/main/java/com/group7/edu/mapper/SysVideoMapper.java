package com.group7.edu.mapper;

import com.group7.edu.entity.Part;
import com.group7.edu.entity.SysVideo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysVideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysVideo record);

    int insertSelective(SysVideo record);

    SysVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysVideo record);

    int updateByPrimaryKey(SysVideo record);

    List<Integer> chapter(int course);

    List<Part> part(int course, int capter, @Param("limit") int limit, @Param("offset") int offset);
}