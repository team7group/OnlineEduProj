package com.group7.edu.mapper.tql;

import com.group7.edu.entity.tql.SysFavorite;
import org.apache.ibatis.annotations.Param;

public interface SysFavoriteTqlMapper {

    SysFavorite videoSelect(@Param("uid") int uid, @Param("videoId") int videoId);
    int insertSelective(SysFavorite sysFavorite);
}
