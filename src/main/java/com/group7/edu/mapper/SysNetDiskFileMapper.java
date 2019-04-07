package com.group7.edu.mapper;

import com.group7.edu.entity.SysNetDiskFile;
import com.group7.edu.entity.SysNetDiskFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNetDiskFileMapper {
    long countByExample(SysNetDiskFileExample example);

    int deleteByExample(SysNetDiskFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysNetDiskFile record);

    int insertSelective(SysNetDiskFile record);

    List<SysNetDiskFile> selectByExample(SysNetDiskFileExample example);

    SysNetDiskFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysNetDiskFile record, @Param("example") SysNetDiskFileExample example);

    int updateByExample(@Param("record") SysNetDiskFile record, @Param("example") SysNetDiskFileExample example);

    int updateByPrimaryKeySelective(SysNetDiskFile record);

    int updateByPrimaryKey(SysNetDiskFile record);
}