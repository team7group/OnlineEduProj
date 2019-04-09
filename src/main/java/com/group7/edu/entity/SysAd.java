package com.group7.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 广告
 *
 * @author default
 * @date   2019/04/09
 */
public class SysAd {
    /**
     * 广告id
     */
    private Integer id;

    /**
     * 广告展示的位置的名称
     */
    private String page;

    /**
     * 广告标题
     */
    private String title;

    /**
     * 广告编号
     */
    private Integer number;

    /**
     * 图片uuid
     */
    private String fileuuid;

    /**
     * 广告内容
     */
    private String adText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFileuuid() {
        return fileuuid;
    }

    public void setFileuuid(String fileuuid) {
        this.fileuuid = fileuuid == null ? null : fileuuid.trim();
    }

    public String getAdText() {
        return adText;
    }

    public void setAdText(String adText) {
        this.adText = adText == null ? null : adText.trim();
    }
}