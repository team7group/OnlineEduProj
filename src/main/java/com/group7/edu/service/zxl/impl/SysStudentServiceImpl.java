package com.group7.edu.service.zxl.impl;

import com.alibaba.fastjson.JSONObject;
import com.group7.edu.entity.SysStudent;
import com.group7.edu.mapper.SysStudentMapper;
import com.group7.edu.service.zxl.SysStudentService;
import com.group7.edu.utils.FastDFSClient;
import com.group7.edu.utils.R;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.csource.fastdfs.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.group7.edu.utils.SignUtil.DAY_31;


/**
 * @auther ZhaoXingLei
 * @date 2019/04/11  11:18
 */
@Service
public class SysStudentServiceImpl implements SysStudentService {
    @Resource
    SysStudentMapper sysStudentMapper;

    @Override
    public SysStudent findStudentById(int id) {

        SysStudent sysStudent = sysStudentMapper.selectStudentByPrimaryKey(id);

        return sysStudent;
    }

    @Override
    public R updateStudent(SysStudent sysStudent) {
        if (sysStudent.getEmail()==null||sysStudent.getEmail().equals("")){
            return R.error("邮箱不能为空");
        }
        int i = sysStudentMapper.updateByPrimaryKeySelective(sysStudent);
        return i>0 ? R.ok("修改成功") : R.error("修改失败");
    }

    @Override
    public R verifyPwd(String pwd, int id) {

        SysStudent sysStudent = sysStudentMapper.selectByPrimaryKey(id);
        Md5Hash md5Hash = new Md5Hash(pwd,sysStudent.getPasswordSalt(),1024);
        pwd= md5Hash.toString();
        System.out.println(pwd);
        if(sysStudent.getPasswordHash().equals(pwd)){
            return R.ok("正确");
        }
        return R.error("错误");
    }

    @Override
    public R updatePwd(String oldPwd,String newPwd, int id) {
        SysStudent sysStudent = sysStudentMapper.selectByPrimaryKey(id);
        Md5Hash md5Hash = new Md5Hash(oldPwd,sysStudent.getPasswordSalt(),1024);
        oldPwd= md5Hash.toString();
        System.out.println(oldPwd);
        if(!sysStudent.getPasswordHash().equals(oldPwd)){
            return R.error("原密码错误");
        }
        Md5Hash md5Hash2 = new Md5Hash(newPwd,sysStudent.getPasswordSalt(),1024);
        newPwd= md5Hash2.toString();
        sysStudent.setPasswordHash(newPwd);
        sysStudent.setId(id);
        int i = sysStudentMapper.updatePwd(sysStudent);

        return i>0 ? R.ok("修改成功") : R.error("修改失败");
    }

    @Override
    public R updateWechat(String wechat, int id) {
        SysStudent sysStudent = new SysStudent();
        sysStudent.setWechat(wechat);
        sysStudent.setId(id);
        int i = sysStudentMapper.updateWechat(sysStudent);

        return i>0 ? R.ok("绑定成功") : R.error("绑定失败");
    }

    @Override
    public R updateQQ(String QQ, int id) {
        SysStudent sysStudent = new SysStudent();
        sysStudent.setQq(QQ);
        sysStudent.setId(id);
        int i = sysStudentMapper.updateQQ(sysStudent);

        return i>0 ? R.ok("绑定成功") : R.error("绑定失败");
    }

    @Override
    public R findsignIn(long id) {
        long checkinDays = sysStudentMapper.findCheckinDays(id);
        // 查看有哪些天签到了
        Map<String,Object> map=new HashMap<String,Object>();
        for (long i = 1, j = 1; i <= DAY_31; i *= 2, j++) {
            System.out.print("第 " + j + " 天：");
            if ((checkinDays | i) == checkinDays) {
                System.out.println("已经签到");
                map.put("day"+j,0);
                //Todo
            } else {
                System.out.println("未签到");
                map.put("day"+j,1);
            }
        }
        Object s = JSONObject.toJSON(map) ;
        return R.ok().put("sign",s);
    }

    //签到
    @Override
    public R signIn(long id) {
        Date dt=new Date();
        SimpleDateFormat matter1=new SimpleDateFormat("yyyy-MM-dd");
        String[] split = matter1.format(dt).split("-");
        int t=Integer.parseInt( split[split.length - 1]);
        int pow =(int) Math.pow(2, t-1);
        SysStudent s = new SysStudent();
        s.setCheckinDays(pow);
        s.setId((int)id);
        long checkinDays = sysStudentMapper.findCheckinDays(id);
        if ((checkinDays |pow ) == checkinDays) {
           // System.out.println("今天已经签到");
            return R.error("今天已经签到");
        }
        int i = sysStudentMapper.updateCheckinDays(s);
        return i>0 ? R.ok("签到成功") : R.error("签到失败");
    }

    //更改头像
    @Override
    public R updateHead(long id, MultipartFile file) {
        try{
            byte[] b = file.getBytes();
            String filename = file.getOriginalFilename();//图片的名字
            //xxxx.jpg
            String suffix = filename.substring(filename.lastIndexOf(".")+1);

            FastDFSClient client = new FastDFSClient("client.conf");
            /**
             * 参数一：图片内容
             * 参数二：后缀
             */
            String paths[] = client.uploadFile(b,suffix);
            StringBuffer sb = new StringBuffer();
            sb.append(paths[0]+File.separator+paths[1]);
            //group1
            //M00/00/00xxx.jpg
            System.out.println("上传成功："+sb.toString());
            SysStudent sysStudent = new SysStudent();
            sysStudent.setId((int)id);
            sysStudent.setIconUuid("http://bjqfzxl.xyz:70/"+sb.toString());
            int i = sysStudentMapper.updateIcon(sysStudent);
            return i>0? R.ok("上传成功"):R.error("上传失败");

        }catch(Exception e){
            e.printStackTrace();
            return R.error("上传失败");

        }

    }
}
