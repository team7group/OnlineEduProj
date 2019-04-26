package com.group7.edu.osshandle;

import com.group7.edu.oss.*;
import com.group7.edu.oss.model.CopyObjectRequest;
import com.group7.edu.oss.model.CopyObjectResult;
import com.group7.edu.oss.model.ObjectMetadata;
import com.group7.edu.osshandle.secretkey.Temporary;
import org.springframework.stereotype.Service;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * @author 993926972
 */
@Service
public class OssSourceInformation implements OssSource {

    @Test
    public void sss(){
        String s = onlinePreview("21c45fde5a434201a2af2298ff6e77bc进阶-林俊杰.mp4", "进阶-林俊杰.mp4", 0);
        System.out.println(s);
    }

    @Override
    public  String fileDownload(String fileUuid, String fileName,int time){
        if (fileUuid!=null&&fileName!=null){
          return   modify(fileUuid,"attachment;filename=" + fileName,time)+"";
        }
        return null;
    }
    @Override
    public  String onlinePreview(String fileUuid, String fileName,int time){
        if (fileUuid!=null&&fileName!=null){
            return modify(fileUuid,"filename=" + fileName,time)+"";
        }
        return null;
    }
    /**
     * 修改源信息，生成url在线播放地址或下载地址。有效期一天。
     * @param fileUuid uuitd
     * @param fileName 文件名
     * @return url的地址
     */
    private static String  modify(String fileUuid,String fileName,int time)  {
        OSS ossClient = new OSSClientBuilder().build(Temporary.ENDPOINT, Temporary.ACCESS_KEY_ID, Temporary.ACCESS_KEY_SECRET);
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(Temporary.SOURCE_BUCKET_NAME, fileUuid, Temporary.SOURCE_BUCKET_NAME, fileUuid);
        ObjectMetadata meta = new ObjectMetadata();
        meta.setContentDisposition(fileName);
        copyObjectRequest.setNewObjectMetadata(meta);
        CopyObjectResult result = null;
        try {
            result = ossClient.copyObject(copyObjectRequest);
            if (result!=null){
                Date date = null;
                if (time<=0){
                    date = new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 180);
                }else {
                    date = new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 180 * time);
                }
                return ossClient.generatePresignedUrl("wojiaotanqinglin", fileUuid,date , HttpMethod.GET)+"";
            }
        } catch (OSSException oe) {
            OssException.ossException(oe);
        } catch (ClientException ce) {
            OssException.clientException(ce);
        }finally {
            ossClient.shutdown();
        }
        return null;
    }
}
