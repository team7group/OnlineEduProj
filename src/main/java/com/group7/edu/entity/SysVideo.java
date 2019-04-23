package com.group7.edu.entity;

import com.group7.edu.utils.BaseEntity;

import java.util.Date;

/**
 * 视频
 *
 * @author default
 * @date   2019/04/11
 */
public class SysVideo extends BaseEntity {
    /**
     * 视频Id
     */
    private Integer id;

    /**
     * 视频名称
     */
    private String name;

    /**
     * 课程Id
     */
    private Integer course;

    /**
     * 章编号
     */
    private Integer capter;

    /**
     * 节编号
     */
    private Integer part;

    /**
     * 视频封面uuid
     */
    private String coverUuid;

    /**
     * 视频时长
     */
    private Date duration;

    /**
     * 视频文件uuid
     */
    private String fileUuid;

    /**
     * 视频分享次数
     */
    private Integer sharingTimes;

    /**
     * 视频点赞次数
     */
    private Integer likeTimes;

    /**
     * 视频保存次数
     */
    private Integer collectionTimes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getCapter() {
        return capter;
    }

    public void setCapter(Integer capter) {
        this.capter = capter;
    }

    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    public String getCoverUuid() {
        return coverUuid;
    }

    public void setCoverUuid(String coverUuid) {
        this.coverUuid = coverUuid == null ? null : coverUuid.trim();
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public String getFileUuid() {
        return fileUuid;
    }

    public void setFileUuid(String fileUuid) {
        this.fileUuid = fileUuid == null ? null : fileUuid.trim();
    }

    public Integer getSharingTimes() {
        return sharingTimes;
    }

    public void setSharingTimes(Integer sharingTimes) {
        this.sharingTimes = sharingTimes;
    }

    public Integer getLikeTimes() {
        return likeTimes;
    }

    public void setLikeTimes(Integer likeTimes) {
        this.likeTimes = likeTimes;
    }

    public Integer getCollectionTimes() {
        return collectionTimes;
    }

    public void setCollectionTimes(Integer collectionTimes) {
        this.collectionTimes = collectionTimes;
    }

    //查询 用户id
    private Integer uid;

    public Integer getUid() {
        return super.getUid();
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}