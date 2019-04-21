package com.group7.edu.entity;

/**
 * 资讯
 *
 * @author default
 * @date   2019/04/21
 */
public class SysIndustryInfo {
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
}