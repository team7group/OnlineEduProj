package com.group7.edu.entity.tql;

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

    private String suffix;

    private Integer type;

    private String     url;

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

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SysNetDiskFile{" +
                "id=" + id +
                ", uid=" + uid +
                ", size='" + size + '\'' +
                ", fileuuid='" + fileuuid + '\'' +
                ", createdTime=" + createdTime +
                ", filename='" + filename + '\'' +
                ", suffix='" + suffix + '\'' +
                ", type=" + type +
                ", url=" + url +
                '}';
    }
}
