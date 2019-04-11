package com.group7.edu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用于课程购买详情页的数据传输
 * @author c
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysCourseDTO {
    /**
     * courseId     课程Id
     * courseName   课程名称
     * price        价格
     * origPrice    原价
     * terminalDate 结束时间
     * createdTime  创建时间
     * startTime    开始时间
     * coverUrl     封面URL
     * courseText   课程简介
     */
    private Integer courseId;
    private String courseName;
    private BigDecimal price;
    private BigDecimal origPrice;
    private Date terminalDate;
    private Date createdTime;
    private Date startTime;
    private String coverUrl;
    private String courseText;

    /**
     * adTitle      广告标题
     * adText       广告内容
     */
    private String adTitle;
    private String adText;

    /**
     * groupId      班级Id
     * groupName    班级名称
     * times        当前是第几期
     */
    private Integer groupId;
    private String groupName;
    private Integer times;

    /**
     * teacherIcon          教师头像
     * teacherName          教师姓名
     * teacherSignature     教师个性签名
     * teacherScore         教师评分
     * studentCount         教师学生数量
     * duration             教师授课时长
     */
    private String teacherIcon;
    private String teacherName;
    private String teacherSignature;
    private String teacherScore;
    private Integer studentCount;
    private Integer duration;
}
