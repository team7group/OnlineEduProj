package com.group7.edu.entity;

import java.util.Date;

/**
 * 
 *
 * @author default
 * @date   2019/04/15
 */
public class SysHomepageCarousel {
    /**
     * 编号

     */
    private Integer id;

    /**
     * 图片
     */
    private String imageUuid;

    /**
     * 时间
     */
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUuid() {
        return imageUuid;
    }

    public void setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid == null ? null : imageUuid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}