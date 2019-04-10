package com.group7.edu.entity;

/**
 * 学院
 *
 * @author default
 * @date   2019/04/09
 */
public class SysDepartment {
    /**
     * 学院id
     */
    private Integer id;

    /**
     * 学院名称
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