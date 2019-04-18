package com.group7.edu.mapper.hky;

import com.group7.edu.entity.SysGroup;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("sysGroupMapperHky")
public interface SysGroupMapperHky {
    int deleteByPrimaryKey(Integer id);

    int insert(SysGroup record);

    int insertSelective(SysGroup record);

    SysGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysGroup record);

    int updateByPrimaryKey(SysGroup record);

    List<SysGroup> notice(int id);
}