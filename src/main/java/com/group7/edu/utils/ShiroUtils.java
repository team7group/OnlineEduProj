package com.group7.edu.utils;

import com.group7.edu.entity.SysStudent;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SimpleSession;
import org.apache.shiro.subject.Subject;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author default
 * 假的Shiro工具类
 */
public class ShiroUtils {
    private static final Map<String, Object> map = new ConcurrentHashMap<>();

    public static Session getSession() {
//        return SecurityUtils.getSubject().getSession();
        return new SimpleSession();
    }

    public static void setAttribute(String key, String value) {
//       getSession().setAttribute(key, value);
        map.put(key, value);
    }

    public static Object getAttribute(String key) {
//        return getSession().getAttribute(key);
        return map.get(key);
    }

    public static Subject getSubject() {
//        return SecurityUtils.getSubject();
        return null;
    }
    public static SysStudent getCurrentUser(){
//        return (SysStudent) SecurityUtils.getSubject().getPrincipal();
        return getUser();
    }

    public static SysStudent getUser() {
//        return (SysStudent) getSubject().getPrincipal();
        SysStudent sysStudent = new SysStudent();
        sysStudent.setId(1);
        sysStudent.setBanned(false);
        sysStudent.setBirthday(new Date());
        sysStudent.setCheckinDays(1024);
        sysStudent.setEmail("1@1.cc");
        sysStudent.setIconUuid(PasswordUtils.md5Hash(PasswordUtils.genSalt(),""));
        sysStudent.setNickname("jack");
        sysStudent.setNumber(1);
        sysStudent.setPasswordHash(sysStudent.getIconUuid());
        sysStudent.setPasswordSalt(PasswordUtils.genSalt());
        sysStudent.setPhone("10086");
        sysStudent.setQq("10001");
        return sysStudent;

    }

    public static Integer getUserId() {
//        return ((SysStudent) getSubject().getPrincipal()).getId();
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("getSession() = " + getSession());
        setAttribute("a", "lalalalala");
        System.out.println("getAttribute(\"a\") = " + getAttribute("a"));
        System.out.println("getSubject() = " + getSubject());
        System.out.println("getUser() = " + getUser());
        System.out.println("getUserId() = " + getUserId());
    }
}






























