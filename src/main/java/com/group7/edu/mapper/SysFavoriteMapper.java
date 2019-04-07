package com.group7.edu.mapper;

import com.group7.edu.entity.SysFavorite;
import com.group7.edu.entity.SysFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFavoriteMapper {
    long countByExample(SysFavoriteExample example);

    int deleteByExample(SysFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysFavorite record);

    int insertSelective(SysFavorite record);

    List<SysFavorite> selectByExample(SysFavoriteExample example);

    SysFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysFavorite record, @Param("example") SysFavoriteExample example);

    int updateByExample(@Param("record") SysFavorite record, @Param("example") SysFavoriteExample example);

    int updateByPrimaryKeySelective(SysFavorite record);

    int updateByPrimaryKey(SysFavorite record);
}