package com.group7.edu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderNumUtils {


    public static Integer getOrderNum(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        StringBuffer sb=new StringBuffer(newDate.substring(2,8));
        sb.append((int)(Math.random()*9+1)*1000);
        Integer i = Integer.valueOf(sb.toString());


        return i;
    }

    public static int num(){

        return 1;
    }

}
