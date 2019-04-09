package com.group7.edu.entity;

/**
 * 荣誉，展示在宣传页面上的
 *
 * @author default
 * @date   2019/04/09
 */
public class SysHonour {
    /**
     * 荣誉id
     */
    private Integer id;

    /**
     * 荣誉编号
     */
    private Integer number;

    /**
     * 荣誉名称
     */
    private String name;

    /**
     * 荣誉uuid
     */
    private String imageUuid;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImageUuid() {
        return imageUuid;
    }

    public void setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid == null ? null : imageUuid.trim();
    }
}