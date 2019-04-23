package com.group7.edu.service.zxl;

import com.group7.edu.entity.SysStudent;
import com.group7.edu.utils.R;
import org.springframework.web.multipart.MultipartFile;

public interface SysStudentService {

    //用户信息
    SysStudent findStudentById(int id);
    //个人资料修改
    R updateStudent(SysStudent sysStudent) ;
    //修改密码时原密码验证
    R verifyPwd(String pwd, int id);

    //修改密码
    R updatePwd(String oldPwd, String newPwd, int id);
    //绑定微信
    R updateWechat(String wechat, int id);
    //绑定QQ
    R updateQQ(String QQ, int id);
    //查询是否签到
    R findsignIn(long id);
    //签到
    R signIn(long id);
    //修改头像
    R updateHead(long id, MultipartFile file);
}
