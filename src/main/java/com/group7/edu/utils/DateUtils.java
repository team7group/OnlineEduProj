package com.group7.edu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: WangJinYue
 * @Description: 格式化日期
 * @Date: Created in 20:30 2019/4/11
 * @Modified By:
 */
public class DateUtils {
    /**
     * @param date  :new Date();
     * @param format :"yyyy-MM-dd"
     * @return
     */
    public static Date dateFormatter(Date date,String format){
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            System.out.println(date.toString());
            date = simpleDateFormat.parse(date.toString());
            return date;
        }catch (Exception e){
            e.printStackTrace();
        }
       return date;
    }
}
