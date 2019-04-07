package com.group7.edu.mapper;

import com.group7.edu.entity.SysAd;
import com.group7.edu.entity.SysAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdMapper {
    long countByExample(SysAdExample example);

    int deleteByExample(SysAdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAd record);

    int insertSelective(SysAd record);

    List<SysAd> selectByExampleWithBLOBs(SysAdExample example);

    List<SysAd> selectByExample(SysAdExample example);

    SysAd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAd record, @Param("example") SysAdExample example);

    int updateByExampleWithBLOBs(@Param("record") SysAd record, @Param("example") SysAdExample example);

    int updateByExample(@Param("record") SysAd record, @Param("example") SysAdExample example);

    int updateByPrimaryKeySelective(SysAd record);

    int updateByPrimaryKeyWithBLOBs(SysAd record);

    int updateByPrimaryKey(SysAd record);
}