package com.group7.edu.entity;

import java.util.Date;

/**
 * 
 *
 * @author default
 * @date   2019/04/15
 */
public class SysHomepageIntroduce {
    /**
     * 编号


     */
    private Integer id;

    /**
     * 主页标题
     */
    private String headline;

    /**
     * 主页介绍
     */
    private String description;

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

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline == null ? null : headline.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}