package com.group7.edu.mapper.tql;

import com.group7.edu.entity.tql.SysVideo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysVideoTqlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysVideo record);

    int insertSelective(SysVideo record);

    SysVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysVideo record);

    int updateByPrimaryKey(SysVideo record);

    /**
     * 点赞次数
     * @param id 视频id
     * @return  0?1
     */
    int spotFabulous(int id);

    /**
     *分享次数
     * @param id 视频id
     * @return 0?1
     */
    int share(int id);

    /**
     *保存次数
     * @param id 视频id
     * @return 0?1
     */
    int preservation(int id);

    /**
     * 相关视频
     * @param capter 视频章节编号
     * @return 0?1
     */
    SysVideo relatedVideos(int capter);

    SysVideo videoSelect(@Param("uid") int uid, @Param("name") String name);

    List<SysVideo> chapterVideos(int capter);
}
