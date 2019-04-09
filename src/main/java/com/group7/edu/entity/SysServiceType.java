package com.group7.edu.entity;

/**
 * 服务类型
 *
 * @author default
 * @date   2019/04/09
 */
public class SysServiceType {
    /**
     * 服务类型id
     */
    private Integer id;

    /**
     * 服务类型名称
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