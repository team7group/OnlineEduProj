package com.group7.edu.entity;

public class Syllabus {
    private Integer id;

    private byte[] courses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getCourses() {
        return courses;
    }

    public void setCourses(byte[] courses) {
        this.courses = courses;
    }
}