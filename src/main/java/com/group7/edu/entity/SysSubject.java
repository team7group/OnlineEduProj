package com.group7.edu.entity;

import com.group7.edu.utils.BaseEntity;

/**
 * 科目
 *
 * @author default
 * @date   2019/04/09
 */
public class SysSubject extends BaseEntity {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"department\":")
                .append(department);
        sb.append(",\"params\":\"")
                .append(params).append('\"');
        sb.append('}');
        return sb.toString();
    }
}