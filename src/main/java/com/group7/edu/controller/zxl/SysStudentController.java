package com.group7.edu.controller.zxl;

import com.group7.edu.entity.SysStudent;
import com.group7.edu.service.zxl.SysStudentService;
import com.group7.edu.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @auther ZhaoXingLei
 * @date 2019/04/11  11:34
 */
@RestController
@RequestMapping("/user")
public class SysStudentController {
    @Resource(name = "sysStudentServiceZxl")
    SysStudentService sysStudentService;

    @RequestMapping("/findById")
    public SysStudent findById(int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.findById");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysStudentService.findStudentById(id);
    }

    @RequestMapping("/verifyPwd")
    public R verifyPwd(String pwd, int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.verifyPwd");
        System.out.println("pwd = [" + pwd + "], id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysStudentService.verifyPwd(pwd, id);
    }

    @RequestMapping("/updateStudent")
    public R updateStudent(SysStudent sysStudent){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.updateStudent");
        System.out.println("sysStudent = [" + sysStudent + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysStudentService.updateStudent(sysStudent);
    }

    @RequestMapping("/updatePwd")
    public R updatePwd(String oldPwd,String newPwd, int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.updatePwd");
        System.out.println("oldPwd = [" + oldPwd + "], newPwd = [" + newPwd + "], id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysStudentService.updatePwd(oldPwd, newPwd, id);
    }

    @RequestMapping("/updateWechat")
    public R updateWechat(String wechat, int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.updateWechat");
        System.out.println("wechat = [" + wechat + "], id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
       return sysStudentService.updateWechat(wechat,id);
    }

    @RequestMapping("/updateQQ")
    public R updateQq(String QQ, int id){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.updateQq");
        System.out.println("QQ = [" + QQ + "], id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysStudentService.updateQQ(QQ,id);
    }

    @RequestMapping("/findsignIn")
    public R findsignIn(long id) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.findsignIn");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysStudentService.findsignIn(id);
    }

    @RequestMapping("/signIn")
    public R signIn(long id) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.signIn");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysStudentService.signIn(id);
    }

    @RequestMapping("/updateHead")
    public R updateHead(long id,MultipartFile file) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysStudentController.updateHead");
        System.out.println("id = [" + id + "], file = [" + file + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysStudentService.updateHead(id, file);
    }
}
