package com.group7.edu.osshandle;

/**
 * @author 993926972
 */
public interface OssDelete {
    /**
     * @param fileUuid 删除oss桶中的文件,传入的是该文件的唯一uuid。
     */
    void deleteFile(String fileUuid);
}
