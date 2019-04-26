package com.group7.edu.osshandle;

import com.group7.edu.oss.ClientException;
import com.group7.edu.oss.OSSException;

class OssException {
    static void ossException(OSSException oe) {
        System.out.println("你的请求发送到OSS,但由于某种原因被拒绝并出现错误响应.");
        System.out.println("错误信息: " + oe.getErrorCode());
        System.out.println("错误代码: " + oe.getErrorCode());
        System.out.println("请求 ID:  " + oe.getRequestId());
        System.out.println("Host ID:  " + oe.getHostId());
    }

     static void clientException(ClientException ce) {
        System.out.println("尝试与OSS通信时遇到严重的内部问题，例如无法访问网络.");
        System.out.println("错误信息: " + ce.getMessage());
    }
}
