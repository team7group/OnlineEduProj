package com.group7.edu.mapper.hky;

import com.group7.edu.entity.Part;
import com.group7.edu.entity.SysVideo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("sysVideoMapperHky")
public interface SysVideoMapperHky {
    int deleteByPrimaryKey(Integer id);

    int insert(SysVideo record);

    int insertSelective(SysVideo record);

    SysVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysVideo record);

    int updateByPrimaryKey(SysVideo record);

    List<Integer> chapter(int course);

    List<Part> part(@Param("course") int course, @Param("capter") int capter, @Param("limit") int limit, @Param("numbers") int numbers);

    Integer totalPage(int course, int capter);
}