package com.group7.edu.service.tql;

import com.group7.edu.entity.tql.SysNetDiskFile;
import com.group7.edu.utils.PagingUtils;
import com.group7.edu.utils.ResultData;

/**
 * @author 993926972
 */
public interface SysNetDiskFileService {
    ResultData fileUpload(SysNetDiskFile sysNetDiskFile);
    PagingUtils fileQuery(int limit, int offset, String type);
    ResultData deleteFile(SysNetDiskFile sysNetDiskFile);
    String onlinePreview(SysNetDiskFile sysNetDiskFile);
    String fileDownload(SysNetDiskFile sysNetDiskFile);
}
