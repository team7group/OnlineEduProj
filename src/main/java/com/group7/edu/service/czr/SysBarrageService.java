package com.group7.edu.service.czr;

import com.group7.edu.entity.SysBarrage;

import java.util.List;

public interface SysBarrageService {

    List<SysBarrage> findByIdDuration(Integer videoId, Integer progress, Integer duration, Integer offset, Integer length);

    int add(SysBarrage barrage);

    int addByBatch(SysBarrage barrage);

    List<String> findTop500(Integer vid);
}
