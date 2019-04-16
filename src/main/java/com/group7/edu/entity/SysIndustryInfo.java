package com.group7.edu.entity;

import com.group7.edu.utils.BaseEntity;

/**
 * 资讯
 *
 * @author default
 * @date   2019/04/09
 */
public class SysIndustryInfo extends BaseEntity {
    /**
     * 资讯id
     */
    private Integer id;

    /**
     * 资讯编号
     */
    private Integer number;

    /**
     * 图片uuid
     */
    private String imageUuid;

    /**
     * 资讯内容
     */
    private String infoText;

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

    public String getImageUuid() {
        return imageUuid;
    }

    public void setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid == null ? null : imageUuid.trim();
    }

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText == null ? null : infoText.trim();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"number\":")
                .append(number);
        sb.append(",\"imageUuid\":\"")
                .append(imageUuid).append('\"');
        sb.append(",\"infoText\":\"")
                .append(infoText).append('\"');
        sb.append(",\"params\":\"")
                .append(params).append('\"');
        sb.append('}');
        return sb.toString();
    }
}