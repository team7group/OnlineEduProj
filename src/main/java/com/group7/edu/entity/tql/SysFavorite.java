package com.group7.edu.entity.tql;

import java.util.Date;

/**
 * 收藏类型
 *
 * @author default
 * @date   2019/04/09
 */
public class SysFavorite {
    /**
     * 收藏id
     */
    private Integer id;

    /**
     * 收藏时间
     */
    private Date createdTime;

    /**
     * 用户Id
     */
    private Integer uid;

    /**
     * 课程id
     */
    private Integer videoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }
}
