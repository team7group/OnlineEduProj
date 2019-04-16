package com.group7.edu.entity;

import java.util.Date;

/**
 * 
 *
 * @author default
 * @date   2019/04/15
 */
public class SysAboutus {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 图片
     */
    private String imageUuid;

    /**
     * 描述
     */
    private String description;

    /**
     * 时间
     */
    private Date ceatetime;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCeatetime() {
        return ceatetime;
    }

    public void setCeatetime(Date ceatetime) {
        this.ceatetime = ceatetime;
    }
}