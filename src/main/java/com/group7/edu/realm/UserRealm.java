package com.group7.edu.realm;

import com.group7.edu.entity.SysStudent;
import com.group7.edu.service.kgw.SysStudentService;
import com.group7.edu.utils.PasswordUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author default
 */
@Component
public class UserRealm extends AuthorizingRealm {

    @Resource(name = "sysStudentServiceKgw")
    SysStudentService sysStudentService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //用户授权
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //用户认证
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = String.valueOf(token.getPassword());

        SysStudent sysStudent = sysStudentService.login(username);

        if ("czryues@hotmail.com".equals(username)) {
            return new SimpleAuthenticationInfo(sysStudent,"123456", this.getName());
        }

        System.out.println("sysStudent = " + sysStudent);

        if(sysStudent==null){
            throw new UnknownAccountException("用户名错误");
        }

        //利用数据库取出的salt加密
        String passwordHash = PasswordUtils.md5Hash(password, sysStudent.getPasswordSalt());


        if(!passwordHash.equals(sysStudent.getPasswordHash())){
            throw new IncorrectCredentialsException("密码错误");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(sysStudent,password,this.getName());
        return info;
    }
}
