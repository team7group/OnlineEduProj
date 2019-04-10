package com.group7.edu.entity;

/**
 * 科目
 *
 * @author default
 * @date   2019/04/09
 */
public class SysSubject {
    /**
     * 科目id
     */
    private Integer id;

    /**
     * 科目名称
     */
    private String name;

    /**
     * 所谓学院id
     */
    private Integer department;

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

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }
}