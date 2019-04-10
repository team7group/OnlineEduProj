package com.group7.edu.entity;

import java.util.Date;

/**
 * 网盘
 *
 * @author default
 * @date   2019/04/09
 */
public class SysNetDiskFile {
    /**
     * 文件Id
     */
    private Integer id;

    /**
     * 用户Id
     */
    private Integer uid;

    /**
     * 文件大小
     */
    private String size;

    /**
     * 文件uuid
     */
    private String fileuuid;

    /**
     * 文件添加时间
     */
    private Date createdTime;

    /**
     * 文件名
     */
    private String filename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getFileuuid() {
        return fileuuid;
    }

    public void setFileuuid(String fileuuid) {
        this.fileuuid = fileuuid == null ? null : fileuuid.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }
}