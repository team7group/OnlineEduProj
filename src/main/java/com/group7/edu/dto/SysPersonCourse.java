package com.group7.edu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysPersonCourse {
    private Integer id;             // 课程id
    private String courseName;      // 课程名称
    private String teacherName;     // 教师名称
    private String courseText;      // 课程介绍
    private String courseCover;     // 课程封面
}
