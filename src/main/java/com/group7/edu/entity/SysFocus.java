package com.group7.edu.entity;

/**
 * 用户关注点
 *
 * @author default
 * @date   2019/04/21
 */
public class SysFocus {
    /**
     * 关注点id
     */
    private Integer id;

    /**
     * 关注点名称
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}