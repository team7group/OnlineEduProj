package com.group7.edu.controller.tql;

import com.group7.edu.entity.tql.SysNetDiskFile;
import com.group7.edu.service.tql.SysNetDiskFileService;
import com.group7.edu.utils.PagingUtils;
import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class SkyDriveController {

    @Resource
    private SysNetDiskFileService sysNetDiskFileService;

    /**
     * @param sysNetDiskFile 上传
     * @return ResultData
     */
    @RequestMapping("/sys/disk/update")
    public ResultData fileUpdate(SysNetDiskFile sysNetDiskFile) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SkyDriveController.fileUpdate");
        System.out.println("sysNetDiskFile = [" + sysNetDiskFile + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysNetDiskFileService.fileUpload(sysNetDiskFile);
    }

    /**
     * 查看所有文件
     * @param limit limit
     * @param offset offset
     * @param type 类型 ，为null为全部查询
     * @return  PagingUtils
     */
    @RequestMapping("/sys/disk/select")
    public PagingUtils fileQuery(int limit, int offset, String type) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SkyDriveController.fileQuery");
        System.out.println("limit = [" + limit + "], offset = [" + offset + "], type = [" + type + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysNetDiskFileService.fileQuery(limit, offset, type);
    }

    /**
     * @param sysNetDiskFile 删除网盘文件
     * @return ResultData
     */
    @RequestMapping("/sys/disk/delete")
    public ResultData fileQuery(SysNetDiskFile sysNetDiskFile) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SkyDriveController.fileQuery");
        System.out.println("sysNetDiskFile = [" + sysNetDiskFile + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysNetDiskFileService.deleteFile(sysNetDiskFile);
    }

    /**
     * @param sysNetDiskFile 文件在线预览 通过type类型判断是图片还是视频
     * @return 返回现在预览地址
     */
    @RequestMapping("/sys/disk/online")
    public String onlinePreview(SysNetDiskFile sysNetDiskFile) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SkyDriveController.onlinePreview");
        System.out.println("sysNetDiskFile = [" + sysNetDiskFile + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysNetDiskFileService.onlinePreview(sysNetDiskFile);
    }

    /**
     * @param sysNetDiskFile 文件下载
     * @return 返回url连接
     */
    @RequestMapping("/sys/disk/download")
    public String fileDownload(SysNetDiskFile sysNetDiskFile) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SkyDriveController.fileDownload");
        System.out.println("sysNetDiskFile = [" + sysNetDiskFile + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return sysNetDiskFileService.fileDownload(sysNetDiskFile);
    }

}
