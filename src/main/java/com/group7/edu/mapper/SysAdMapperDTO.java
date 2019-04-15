package com.group7.edu.mapper;

import com.group7.edu.entity.SysAd;

import java.util.List;

public interface SysAdMapperDTO {

    List<SysAd> selectAll(String page);

}