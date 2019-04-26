package com.group7.edu.osshandle;

import com.group7.edu.oss.ClientException;
import com.group7.edu.oss.HttpMethod;
import com.group7.edu.oss.OSS;
import com.group7.edu.oss.OSSClientBuilder;
import com.group7.edu.oss.model.GeneratePresignedUrlRequest;
import com.group7.edu.osshandle.secretkey.Temporary;
import com.group7.edu.utils.StringUtils;
import org.springframework.stereotype.Service;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * @author 993926972
 */
@Service
public class OssPictureProcessing implements OssPicture {
    @Test
    public void ss(){
        String compressionfixation = compressionfixation("0010d0d186694e7e92043b511387d1datimg (7).jpg");
        System.out.println(compressionfixation);
    }
    @Override
    public  String  pctureArbitrarySize(String fileUuid, int w, int h) {
        if (StringUtils.isNotEmpty(fileUuid)){
            return getUrl(fileUuid, new OSSClientBuilder().build(Temporary.ENDPOINT, Temporary.ACCESS_KEY_ID, Temporary.ACCESS_KEY_SECRET), "image/resize,m_fixed,w_"+w+",h_"+h+"")+"";
        }
        return null;
    }
    @Override
    public  String  compressionfixation(String fileUuid){
        if (StringUtils.isNotEmpty(fileUuid)){
            return getUrl(fileUuid, new OSSClientBuilder().build(Temporary.ENDPOINT, Temporary.ACCESS_KEY_ID, Temporary.ACCESS_KEY_SECRET), "image/resize,m_fixed,w_"+156+",h_"+156+"")+"";
        }
        return null;
    }
    @Override
    public  String  originalGraph(String fileUuid) {
        if (StringUtils.isNotEmpty(fileUuid)){
            return  getUrl(fileUuid, new OSSClientBuilder().build(Temporary.ENDPOINT, Temporary.ACCESS_KEY_ID, Temporary.ACCESS_KEY_SECRET), "image/resize,m_fixed,w_"+4000+",h_"+4000+"")+"";
        }
        return null;
    }
    /**
     * 图片处理
     * @param fileUuid 文件uuid
     * @param ossClient 调用图片处理
     * @param style 格式
     */
    private String getUrl(String fileUuid, OSS ossClient, String style) {
        GeneratePresignedUrlRequest req = new GeneratePresignedUrlRequest(Temporary.SOURCE_BUCKET_NAME, fileUuid, HttpMethod.GET);
        req.setExpiration(new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 180));
        req.setProcess(style);
        try {
            return ossClient.generatePresignedUrl(req)+"";
        } catch (ClientException ce) {
            OssException.clientException(ce);
        }finally {
            ossClient.shutdown();
        }
        return null;
    }
}
