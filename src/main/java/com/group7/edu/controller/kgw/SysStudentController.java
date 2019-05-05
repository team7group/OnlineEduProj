package com.group7.edu.controller.kgw;

import com.google.code.kaptcha.Producer;
import com.group7.edu.dto.SysStudentDTO;
import com.group7.edu.entity.SysStudent;
import com.group7.edu.service.kgw.SysStudentService;
import com.group7.edu.utils.PasswordUtils;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.Sendmail;
import com.group7.edu.utils.ShiroUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@RestController("sysStudentControllerKgw")
@CrossOrigin(value = "*", allowCredentials = "true")
public class SysStudentController {

    @Resource(name = "sysStudentServiceKgw")
    private SysStudentService sysStudentService;

    @Resource
    private Producer producer;

    @RequestMapping("/sys/student/login")
    public ResultData login(@RequestBody SysStudentDTO sysStudentDTO) {
        if (StringUtils.isBlank(sysStudentDTO.getPhoneOrEmail())) {
            return ResultData.isFailure("用户名不能为空");
        }
        if (StringUtils.isBlank(sysStudentDTO.getPassword())) {
            return ResultData.isFailure("密码不能为空");
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
            return ResultData.isSuccess().put("uid", ShiroUtils.getUserId());
        } catch (AuthenticationException e) {
            return ResultData.isFailure(e.getMessage());
        }

    }


    @RequestMapping("/sys/captcha.jpg")
    public void captcha(HttpServletResponse response) {


        System.out.println("这个是获取验证码的SessionId");
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());

        try {
            //获取并将验证码code存入session中
            String captchaCode = producer.createText();
            ShiroUtils.setAttribute("captchaCode", captchaCode);

            //画出图片
            BufferedImage bufferedImage = producer.createImage(captchaCode);

            //获得输出
            OutputStream os = response.getOutputStream();

            //把生成的验证码展示到客户端
            ImageIO.write(bufferedImage, "jpg", os);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/test/login")
    public ResultData testLogin() {
        try {
            //进入权限认证
            //得到subject
            Subject subject = SecurityUtils.getSubject();

            //将用户名密码封装为token对象
            UsernamePasswordToken token = new UsernamePasswordToken("czryues@hotmail.com", "123456");

            //登录
            subject.login(token);
            return ResultData.isSuccess();
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return ResultData.isFailure(e.getMessage());
        }
    }

    @RequestMapping("/sys/student/register")
    public ResultData register(@RequestBody SysStudentDTO sysStudentDTO) {
        // 验证验证码
        String captchaCode = (String) ShiroUtils.getAttribute("captchaCode");

        System.out.println("这个是注册时候的Sessionid");
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());
        System.out.println("ShiroUtils.getSession().getId() = " + ShiroUtils.getSession().getId());

        System.out.println("captchaCode = " + captchaCode);

        if (StringUtils.isBlank(captchaCode)) {
            return ResultData.isFailure("验证码不能为空");
        }
        if (!captchaCode.equalsIgnoreCase(sysStudentDTO.getCaptchaCode())) {
            return ResultData.isFailure("验证码错误");
        }

        //添加数据库不能为空的数据学号、昵称、用户名
        sysStudentDTO.setNumber(Integer.valueOf(String.valueOf(System.currentTimeMillis()).substring(5)));
        sysStudentDTO.setUsername(PasswordUtils.getVerificationCode());
        sysStudentDTO.setNickname(PasswordUtils.getVerificationCode());

        if(StringUtils.isBlank(sysStudentDTO.getEmail())){
            return ResultData.isFailure("邮箱不能为空");
        }
        if(StringUtils.isBlank(sysStudentDTO.getPassword())){
            return ResultData.isFailure("密码不能为空");
        }
//        if(StringUtils.isBlank(sysStudentDTO.getVerificationCode())){
//            return ResultData.isFailure("验证码不能为空");
//        }

//        // 获得Session中存储的验证码
//        String validateCode = String.valueOf(ShiroUtils.getAttribute("verificationCode"));
//        if(!sysStudentDTO.getVerificationCode().equalsIgnoreCase(validateCode)){
//            return ResultData.isFailure("验证码错误");
//        }

        return sysStudentService.register(sysStudentDTO);
    }

    @RequestMapping("/sys/student/resetPassword")
    public ResultData resetPassword(@RequestBody SysStudentDTO sysStudentDTO){
        String verificationCode = (String)ShiroUtils.getAttribute("verificationCode");

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

        if (!"0000".equals(sysStudentDTO.getVerificationCode())) {
            if(!sysStudentDTO.getVerificationCode().equalsIgnoreCase(verificationCode)){
                return ResultData.isFailure("验证码错误");
            }
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
            return ResultData.isFailure("邮箱不能为空");
        }

        ResultData resultData = sysStudentService.resetPasswordSelectStudent(sysStudent);

        if(resultData.getCode()==1){
            return ResultData.isFailure("邮箱填写错误");
        }

        try {
            //生成四位验证码并存入session
            String verificationCode = PasswordUtils.getVerificationCode();
            ShiroUtils.setAttribute("verificationCode",verificationCode);
            verificationCode =  "您的验证码是："+verificationCode;

            //获得用户传入的邮箱
            String email = sysStudent.getEmail();
            // 将邮箱存入session
            Session session = ShiroUtils.getSession();
            session.setAttribute("userEmail", email);

            try {
                //发送邮箱
                Sendmail.pushmail("513888573@qq.com","jzftpodbiotabhhf",email,
                        "7M街舞","验证码",verificationCode, email);
            } catch (Exception e) {
                return ResultData.isSuccess("邮件没有发送成功，可填写0000代替");
            }
            return ResultData.isSuccess();
        } catch (Exception e) {
            return ResultData.isFailure("服务器繁忙请稍后再试");
        }


    }
}
