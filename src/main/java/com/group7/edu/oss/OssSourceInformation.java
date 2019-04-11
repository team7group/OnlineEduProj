package com.group7.edu.oss;

import com.group7.edu.oss.*;

import java.net.URL;
import java.util.Date;

/**
 * @author 993926972
 */
public class OssSourceInformation implements OssSource {
    @Override
    public  String onlinePreview(String fileUuid, String fileName){
        return "http://wojiaotanqinglin.oss-cn-beijing.aliyuncs.com/69201bf6fb284a01987f3292842f7e37mv%E8%A7%86%E9%A2%91.mp4?Expires=1570372357&OSSAccessKeyId=LTAIL1qngeuPQ1Vw&Signature=Q3DH48Bcq3SoI6BaHvS656HQEgs%3D\n";
    }
}
