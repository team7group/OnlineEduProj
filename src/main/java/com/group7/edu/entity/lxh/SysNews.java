package com.group7.edu.entity.lxh;

import com.group7.edu.utils.BaseEntity;

import java.util.Date;

/**
 * 新闻
 *
 * @author default
 * @date   2019/04/09
 */
public class SysNews extends BaseEntity {
    /**
     * 新闻id
     */
    private Integer id;

    /**
     * 编号
     */
    private Integer number;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻封面uuid
     */
    private String coverUuid;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 新闻内容
     */
    private String newsText;

    /**
     * 模糊查詢参数 (自定义无字段)
     */
    private String params;


    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCoverUuid() {
        return coverUuid;
    }

    public void setCoverUuid(String coverUuid) {
        this.coverUuid = coverUuid == null ? null : coverUuid.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {

        this.newsText = newsText == null ? null : newsText.trim();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"number\":")
                .append(number);
        sb.append(",\"title\":\"")
                .append(title).append('\"');
        sb.append(",\"coverUuid\":\"")
                .append(coverUuid).append('\"');
        sb.append(",\"createdTime\":\"")
                .append(createdTime).append('\"');
        sb.append(",\"newsText\":\"")
                .append(newsText).append('\"');
        sb.append(",\"params\":\"")
                .append(params).append('\"');
        sb.append('}');
        return sb.toString();
    }
}