package com.group7.edu.service.tql.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.group7.edu.entity.tql.SysNetDiskFile;
import com.group7.edu.mapper.tql.SysNetDiskFileTqlMapper;
import com.group7.edu.osshandle.DeleteFile;
import com.group7.edu.osshandle.OssPicture;
import com.group7.edu.osshandle.OssSource;
import com.group7.edu.osshandle.OssSourceInformation;
import com.group7.edu.service.tql.SysNetDiskFileService;
import com.group7.edu.utils.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 993926972
 */
@Service(value = "sysNetDiskFileServiceImpl")
public class SysNetDiskFileServiceImpl implements SysNetDiskFileService {
    @Resource
    private SysNetDiskFileTqlMapper sysNetDiskFileTqlMapper;
    @Resource
    private DeleteFile deleteFile;
    @Resource
    private OssPicture ossPicture;
    @Resource
    private OssSource ossSource;
    @Resource
    private OssSourceInformation sourceInformation;

    /**
     * @param sysNetDiskFile 文件上传
     * @return 返回石头成功
     */
    @Override
    public ResultData fileUpload(SysNetDiskFile sysNetDiskFile) {
        if (sysNetDiskFile!=null){
            String suffix = sysNetDiskFile.getSuffix();
            if (StringUtils.isNotEmpty(suffix)){
                if (ConstantUtils.JPG.equals(suffix)||ConstantUtils.PNG.equals(suffix)||ConstantUtils.BMP.equals(suffix)||ConstantUtils.GIF.equals(suffix)||ConstantUtils.WEBP.equals(suffix)||ConstantUtils.TIFF.equals(suffix)){
                    sysNetDiskFile.setType(1);
                }
                else if (ConstantUtils.TXT.equals(suffix)||ConstantUtils.PDF.equals(suffix)||ConstantUtils.PPTV.equals(suffix)||ConstantUtils.DOC.equals(suffix)||ConstantUtils.XLSX.equals(suffix)||ConstantUtils.PPT.equals(suffix)||ConstantUtils.DOCX.equals(suffix)){
                    sysNetDiskFile.setType(2);
                }
                else if (ConstantUtils.MP4.equals(suffix)||ConstantUtils.M4V.equals(suffix)){
                    sysNetDiskFile.setType(3);
                }
                else if (ConstantUtils.MP3.equals(suffix)||ConstantUtils.WMA.equals(suffix)){
                    sysNetDiskFile.setType(4);
                }
                else {
                    sysNetDiskFile.setType(0);
                }
                sysNetDiskFile.setCreatedTime(new Date());
                sysNetDiskFile.setUid(ShiroUtils.getUserId());
                int i = sysNetDiskFileTqlMapper.insertSelective(sysNetDiskFile);
                if (i>0){
                    return ResultData.isSuccess();
                }
            }
        }
        return ResultData.isFailure("文件上传失败");
    }

    @Override
    public PagingUtils fileQuery(int limit, int offset, String type) {
        PageHelper.offsetPage(limit,offset);
        int userId = ShiroUtils.getUserId();
        List<SysNetDiskFile> sysNetDiskFiles = null;
        if (type==null){
            sysNetDiskFiles = sysNetDiskFileTqlMapper.allQueriesFile(userId);
            ifUUid(sysNetDiskFiles);
        }else {
            if (ConstantUtils.PICTURE.equals(type)){
                sysNetDiskFiles= sysNetDiskFileTqlMapper.typeQuery(1, userId);
                ifUUid(sysNetDiskFiles);
            }
            if (ConstantUtils.FILE.equals(type)){
                sysNetDiskFiles = sysNetDiskFileTqlMapper.typeQuery(2,userId);
                ifUUid(sysNetDiskFiles);
            }
            if (ConstantUtils.VIDEO.equals(type)){
                sysNetDiskFiles = sysNetDiskFileTqlMapper.typeQuery(3,userId);
                ifUUid(sysNetDiskFiles);
            }
            if (ConstantUtils.MUSIC.equals(type)){
                sysNetDiskFiles = sysNetDiskFileTqlMapper.typeQuery(4,userId);
                ifUUid(sysNetDiskFiles);
            }
        }
        PageInfo info = new PageInfo(sysNetDiskFiles);
        List list = info.getList();
        long total = info.getTotal();
        return new PagingUtils(total,list);
    }

    private void ifUUid(List<SysNetDiskFile> sysNetDiskFiles) {
        if (sysNetDiskFiles!=null){
            for (SysNetDiskFile sysNetDiskFile : sysNetDiskFiles) {
                if (sysNetDiskFile.getType().equals(1)){
                    sysNetDiskFile.setUrl(ossPicture.compressionfixation(sysNetDiskFile.getFileuuid()));
                }
                if (sysNetDiskFile.getType().equals(3)){
                    sysNetDiskFile.setUrl(sourceInformation.onlinePreview(sysNetDiskFile.getFileuuid(),sysNetDiskFile.getFilename(),0));
                }
            }
        }
    }

    @Override
    public ResultData deleteFile(SysNetDiskFile sysNetDiskFile) {
        int i = sysNetDiskFileTqlMapper.deleteByPrimaryKey(sysNetDiskFile.getId());
        if (i>0){
            deleteFile.deleteFile(sysNetDiskFile.getFileuuid());
            return ResultData.isSuccess();
        }
        return ResultData.isFailure();
    }

    @Override
    public String onlinePreview(SysNetDiskFile sysNetDiskFile) {
        if (sysNetDiskFile.getType().equals(ConstantUtils.PICTURE_TYPE)){
            return ossPicture.originalGraph(sysNetDiskFile.getFileuuid());
        }
        if (sysNetDiskFile.getType().equals(ConstantUtils.VIDEO_TYPE)){
            return ossSource.onlinePreview(sysNetDiskFile.getFileuuid(),sysNetDiskFile.getFilename(),0);
        }
        return null;
    }

    @Override
    public String fileDownload(SysNetDiskFile sysNetDiskFile) {
        return ossSource.fileDownload(sysNetDiskFile.getFileuuid(),sysNetDiskFile.getFilename(),0);
    }

}
