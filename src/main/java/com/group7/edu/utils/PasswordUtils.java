package com.group7.edu.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author default
 */
public class PasswordUtils {
    private static final char[] CHARS = new char[] {
                    '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                    'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D',
                    'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                    'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                    'Y', 'Z' };

    private static final int MIN_LENGTH = 2;
    private static final int MAX_LENGTH = 6;

    /**
     * 计算密码MD5值，迭代1024次
     * @param password 密码
     * @param salt 私盐
     * @return MD5值
     */
    public static String md5Hash(String password, String salt) {
        Md5Hash md5Hash = new Md5Hash(password, salt, 1024);
        return md5Hash.toHex();
    }

    /**
     * 生成私盐
     * @return 私盐
     */
    public static String genSalt() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = rnd.nextInt(MIN_LENGTH, MAX_LENGTH); i > 0; i--) {
            stringBuilder.append(CHARS[rnd.nextInt(CHARS.length)]);
        }
        return stringBuilder.toString();
    }
    public static String getVerificationCode() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = rnd.nextInt(4,5); i > 0; i--) {
            stringBuilder.append(CHARS[rnd.nextInt(CHARS.length)]);
        }
        return stringBuilder.toString();
    }

    private PasswordUtils() {}
}
