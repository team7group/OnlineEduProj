package com.group7.edu.oss;

import java.net.URL;

/**
 * 修改文件源信息 在线预览/下载
 * 传入文件的uuid和文件名
 */
public interface OssSource {
      /**
       * 修改文件源信息，在线预览
       * @param fileUuid uuid
       * @param fileName 文件名
       * @return url在线预览连接
       */
      String onlinePreview(String fileUuid, String fileName);
}
