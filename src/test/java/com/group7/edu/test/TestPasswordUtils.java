package com.group7.edu.test;

import com.group7.edu.entity.SysAd;
import com.group7.edu.utils.PasswordUtils;
import org.junit.Test;

public class TestPasswordUtils {

    @Test
    public void testMd5Hash() {
        String pwd = "123456";
        String salt = PasswordUtils.genSalt();
        String pwdHash = PasswordUtils.md5Hash(pwd, salt);
        System.out.println("pwd = " + pwd);
        System.out.println("salt = " + salt);
        System.out.println("pwdHash = " + pwdHash);
    }

    @Test
    public void testGenSalt() {
        for (int i = 0; i < 100; i++) {
            System.out.println("PasswordUtils.genSalt() = " + PasswordUtils.genSalt());
        }
    }

    @Test
    public void test1(){
        SysAd sysAd = new SysAd();

    }

}
