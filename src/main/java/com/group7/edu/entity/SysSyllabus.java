package com.group7.edu.entity;

/**
 * 课程表
 *
 * @author default
 * @date   2019/04/09
 */
public class SysSyllabus {
    /**
     * 课程表Id
     */
    private Integer id;

    /**
     * 课程集合
     */
    private String courses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses == null ? null : courses.trim();
    }
}