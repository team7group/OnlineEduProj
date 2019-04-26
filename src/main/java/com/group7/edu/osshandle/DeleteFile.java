package com.group7.edu.osshandle;

import com.group7.edu.oss.ClientException;
import com.group7.edu.oss.OSS;
import com.group7.edu.oss.OSSClientBuilder;
import com.group7.edu.oss.OSSException;
import com.group7.edu.osshandle.secretkey.Temporary;
import org.springframework.stereotype.Service;

/**
 * @author 993926972
 */
@Service
public class DeleteFile implements OssDelete {
    @Override
    public  void deleteFile(String fileUuid) {
        OSS ossClient = new OSSClientBuilder().build(Temporary.ENDPOINT, Temporary.ACCESS_KEY_ID, Temporary.ACCESS_KEY_SECRET);
        try {
            ossClient.deleteObject(Temporary.BUCKET_NAME, fileUuid);
        } catch (OSSException oe) {
            OssException.ossException(oe);
        } catch (ClientException ce) {
            OssException.clientException(ce);
        }finally {
            ossClient.shutdown();
        }
    }

}
