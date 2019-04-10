package com.group7.edu.oss;

import java.io.IOException;
import java.net.URL;

/**
 * 图片处理
 *传入的是文件的uuid
 */
public interface OssPicture {
    /**
     * //任意大小的图片缩略
     * @param fileUuid 文件uuid
     * @param w 宽
     * @param h 高
     */
    String pctureArbitrarySize(String fileUuid, int w, int h);
    /**
     *固定156x156大小缩略图
     * @param fileUuid 文件uuid
     */
    String  compressionfixation(String fileUuid);
    /**
     *原图大小
     * @param fileUuid 文件uuid
     */
    String  originalGraph(String fileUuid);

}
