package com.group7.edu.mapper.tql;

import com.group7.edu.entity.tql.SysNetDiskFile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysNetDiskFileTqlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysNetDiskFile record);

    int insertSelective(SysNetDiskFile record);

    SysNetDiskFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysNetDiskFile record);

    int updateByPrimaryKey(SysNetDiskFile record);

    List<SysNetDiskFile> allQueriesFile(int uid);

    List<SysNetDiskFile> typeQuery(@Param("type") int type, @Param("uid") int uid);

    SysNetDiskFile selectSingleFile(String fileUuid);
}
