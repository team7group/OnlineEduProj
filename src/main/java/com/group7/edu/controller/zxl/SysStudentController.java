package com.group7.edu.controller.zxl;

import com.group7.edu.entity.SysStudent;
import com.group7.edu.service.SysStudentService;
import com.group7.edu.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @auther ZhaoXingLei
 * @date 2019/04/11  11:34
 */
@RestController("sysStudentControllerZxl")
@RequestMapping("/user")
public class SysStudentController {
    @Resource
    SysStudentService sysStudentService;

    @RequestMapping("/findById")
    public SysStudent findById(int id){

        return sysStudentService.findStudentById(id);
    }
    @RequestMapping("/verifyPwd")

    public R verifyPwd(String pwd, int id){
        return sysStudentService.verifyPwd(pwd, id);
    }

    @RequestMapping("/updateStudent")
    public R updateStudent(SysStudent sysStudent){
        return sysStudentService.updateStudent(sysStudent);
    }
    @RequestMapping("/updatePwd")
    public R updatePwd(String oldPwd,String newPwd, int id){
        return sysStudentService.updatePwd(oldPwd, newPwd, id);
    }
    @RequestMapping("/updateWechat")
    public R updateWechat(String wechat, int id){
       return sysStudentService.updateWechat(wechat,id);
    }
    @RequestMapping("/updateQQ")
    public R updateQq(String QQ, int id){
        return sysStudentService.updateQQ(QQ,id);
    }
    @RequestMapping("/findsignIn")
    public R findsignIn(long id) {
        return sysStudentService.findsignIn(id);
    }

    @RequestMapping("/signIn")
    public R signIn(long id) {
        return sysStudentService.signIn(id);
    }

    @RequestMapping("/updateHead")
    public R updateHead(long id,MultipartFile file) {
        return sysStudentService.updateHead(id, file);
    }
}
