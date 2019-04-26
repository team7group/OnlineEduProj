package com.group7.edu.mapper;

import com.group7.edu.entity.NetDiskFile;
import com.group7.edu.entity.NetDiskFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetDiskFileMapper {
    long countByExample(NetDiskFileExample example);

    int deleteByExample(NetDiskFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NetDiskFile record);

    int insertSelective(NetDiskFile record);

    List<NetDiskFile> selectByExample(NetDiskFileExample example);

    NetDiskFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NetDiskFile record, @Param("example") NetDiskFileExample example);

    int updateByExample(@Param("record") NetDiskFile record, @Param("example") NetDiskFileExample example);

    int updateByPrimaryKeySelective(NetDiskFile record);

    int updateByPrimaryKey(NetDiskFile record);
}