package com.group7.edu.entity;

/**
 * 学生与视频的关系
 *
 * @author default
 * @date   2019/04/11
 */
public class SysStudentVideoRelation {
    /**
     * 用户与视频关系id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 视频id
     */
    private Integer videoId;

    /**
     * 用户是否看过该视频
     */
    private Boolean isWatched;

    /**
     * 用户是否收藏过该视频
     */
    private Boolean isLiked;

    /**
     * 用户是否保存过该视频
     */
    private Boolean isSaved;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Boolean getIsWatched() {
        return isWatched;
    }

    public void setIsWatched(Boolean isWatched) {
        this.isWatched = isWatched;
    }

    public Boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Boolean getIsSaved() {
        return isSaved;
    }

    public void setIsSaved(Boolean isSaved) {
        this.isSaved = isSaved;
    }
}