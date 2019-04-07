package com.group7.edu.entity;

public class SysSyllabus {
    private Integer id;

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