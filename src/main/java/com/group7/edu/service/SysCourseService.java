package com.group7.edu.service;

import com.group7.edu.entity.SysCourse;

import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 22:53 2019/4/11
 * @Modified By:
 */
public interface SysCourseService {
    //通过id 查课程信息
    List<SysCourse> findById(SysCourse id);

}
