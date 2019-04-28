package com.group7.edu.mapper.czr;

import com.group7.edu.entity.SysBarrage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysBarrageExtMapper {

    int insertBatch(List<SysBarrage> list);

    List<SysBarrage> selectByIdDuration(
            @Param("vid") Integer videoId,
            @Param("pos") Integer progress,
            @Param("duration") Integer duration,
            @Param("off") Integer offset,
            @Param("len") Integer length);

    List<String> selectTop300(Integer vid);
}
