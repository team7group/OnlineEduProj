package com.group7.edu.mapper;

import com.group7.edu.entity.SysHonour;
import com.group7.edu.entity.SysHonourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysHonourMapper {
    long countByExample(SysHonourExample example);

    int deleteByExample(SysHonourExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysHonour record);

    int insertSelective(SysHonour record);

    List<SysHonour> selectByExample(SysHonourExample example);

    SysHonour selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysHonour record, @Param("example") SysHonourExample example);

    int updateByExample(@Param("record") SysHonour record, @Param("example") SysHonourExample example);

    int updateByPrimaryKeySelective(SysHonour record);

    int updateByPrimaryKey(SysHonour record);
}