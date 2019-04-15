package com.group7.edu.controller;

import com.google.code.kaptcha.Producer;
import com.group7.edu.dto.SysStudentDTO;
import com.group7.edu.entity.SysStudent;
import com.group7.edu.service.SysStudentService;
import com.group7.edu.utils.PasswordUtils;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.Sendmail;
import com.group7.edu.utils.ShiroUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@RestController
public class SysStudentController {

    @Resource
    private SysStudentService sysStudentService;

    @Resource
    private Producer producer;


    @RequestMapping("/sys/student/login")
    public ResultData login(@RequestBody SysStudentDTO sysStudentDTO) {
        //获得验证码
        String captchaCode = (String) ShiroUtils.getAttribute("captchaCode");

        if (StringUtils.isBlank(sysStudentDTO.getPhoneOrEmail())) {
            return ResultData.isFailure("用户名不能为空");
        }
        if (StringUtils.isBlank(sysStudentDTO.getPassword())) {
            return ResultData.isFailure("密码不能为空");
        }
        if (StringUtils.isBlank(captchaCode)) {
            return ResultData.isFailure("验证码不能为空");
        }
        if (!captchaCode.equalsIgnoreCase(sysStudentDTO.getCaptchaCode())) {
            return ResultData.isFailure("验证码错误");
        }
        try {
            //进入权限认证
            //得到subject
            Subject subject = SecurityUtils.getSubject();

            //将用户名密码封装为token对象
            UsernamePasswordToken token = new UsernamePasswordToken(sysStudentDTO.getPhoneOrEmail(), sysStudentDTO.getPassword());

            //记住我
            if (sysStudentDTO.isRememberMe()) {
                token.setRememberMe(true);
            }
            //登录
            subject.login(token);
            return ResultData.isSuccess();
        } catch (AuthenticationException e) {
            return ResultData.isFailure(e.getMessage());
        }

    }


    @RequestMapping("/sys/captcha.jpg")
    public void captcha(HttpServletResponse response) {

        try {
            //获取并将验证码code存入session中
            String captchaCode = producer.createText();
            ShiroUtils.setAttribute("captchaCode", captchaCode);

            //画出图片
            BufferedImage bufferedImage = producer.createImage(captchaCode);

            //获得输出流
            OutputStream os = response.getOutputStream();

            //把生成的验证码展示到客户端
            ImageIO.write(bufferedImage, "jpg", os);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/sys/student/register")
    public ResultData register(@RequestBody SysStudentDTO sysStudentDTO) {

        //判断必要的值是否为空
        if(sysStudentDTO.getNumber()==null||sysStudentDTO.getNumber()<0){
            return ResultData.isFailure("学号不能为空");
        }
        if(StringUtils.isBlank(sysStudentDTO.getUsername())){
            return ResultData.isFailure("用户昵称不能为空");
        }
        if(StringUtils.isBlank(sysStudentDTO.getNickname())){
            return ResultData.isFailure("用户名不能为空");
        }
        if(StringUtils.isBlank(sysStudentDTO.getPassword())){
            return ResultData.isFailure("密码不能为空");
        }
        if(StringUtils.isBlank(sysStudentDTO.getEmail())){
            return ResultData.isFailure("邮箱不能为空");
        }

        return sysStudentService.register(sysStudentDTO);
    }

    @RequestMapping("/sys/student/resetPassword")
    public ResultData resetPassword(@RequestBody SysStudentDTO sysStudentDTO){
        String verificationCode = (String)ShiroUtils.getAttribute("verificationCode");
        System.out.println("verificationCode = " + verificationCode);
        System.out.println("verificationCode = " + verificationCode);
        System.out.println("verificationCode = " + verificationCode);
        System.out.println("verificationCode = " + verificationCode);
        System.out.println("sysStudentDTO.getPassword() = " + sysStudentDTO.getPassword());
        System.out.println("sysStudentDTO.getPassword() = " + sysStudentDTO.getPassword());
        System.out.println("sysStudentDTO.getPassword() = " + sysStudentDTO.getPassword());
        System.out.println("sysStudentDTO.getConfirmPassword() = " + sysStudentDTO.getConfirmPassword());
        System.out.println("sysStudentDTO.getConfirmPassword() = " + sysStudentDTO.getConfirmPassword());
        System.out.println("sysStudentDTO.getConfirmPassword() = " + sysStudentDTO.getConfirmPassword());

        if(StringUtils.isBlank(sysStudentDTO.getVerificationCode())){
            return ResultData.isFailure("验证码不能为空");
        }
        if(StringUtils.isBlank(sysStudentDTO.getPassword())){
            return ResultData.isFailure("密码不能为空");
        }
        if(StringUtils.isBlank(sysStudentDTO.getConfirmPassword())){
            return ResultData.isFailure("确认密码不能为空");
        }
        if(!sysStudentDTO.getPassword().equals(sysStudentDTO.getConfirmPassword())){
            return ResultData.isFailure("两次密码输入不一致");
        }
        if(!sysStudentDTO.getVerificationCode().equalsIgnoreCase(verificationCode)){
            return ResultData.isFailure("验证码错误");
        }

        //密码加密
        String password = sysStudentDTO.getPassword();
        String passwordSalt = PasswordUtils.genSalt();
        String passwordHash = PasswordUtils.md5Hash(password, passwordSalt);

        //加密后的密码、salt存入sysStudentDTO对象中
        sysStudentDTO.setPasswordHash(passwordHash);
        sysStudentDTO.setPasswordSalt(passwordSalt);

        return sysStudentService.resetPassword(sysStudentDTO);

    }

    @RequestMapping("/sys/verificationCode")
    public ResultData verificationCode(@RequestBody SysStudent sysStudent){

        if(sysStudent.getEmail()==null){
            return ResultData.isFailure("验证码不能为空");
        }

        ResultData resultData = sysStudentService.resetPasswordSelectStudent(sysStudent);

        if(resultData.getCode()==1){
            return ResultData.isFailure("邮箱输入错误");
        }

        try {
            //生成四位验证码并存入session
            String verificationCode = PasswordUtils.getVerificationCode();
            ShiroUtils.setAttribute("verificationCode",verificationCode);
            verificationCode =  "您的验证码是："+verificationCode;

            //获得用户传入的邮箱
            String email = sysStudent.getEmail();
            //从数据库获得该邮箱的使用人的用户名
            String username = ((SysStudent)resultData.get("sysStudent")).getUsername();

            System.out.println("username = " + username);
            System.out.println("username = " + username);
            System.out.println("username = " + username);
            System.out.println("username = " + username);
            System.out.println("username = " + username);
            //发送邮箱
            Sendmail.pushmail("513888573@qq.com","jzftpodbiotabhhf",email,
                    "第七项目组","验证码",verificationCode,username);
            return ResultData.isSuccess();
        } catch (Exception e) {
            return ResultData.isFailure("服务器繁忙请稍后再试");
        }


    }
}
