package com.group7.edu.utils;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;



public class Sendmail {
    /**
     *
     * @param account 第七项目组人邮箱
     * @param password smtp密码
     * @param reciver 收件人邮箱地址
     * @param name 发件人姓名（第七项目组）
     * @param title 邮箱标题（验证码）
     * @param content （邮件内容）
     * @param recipients （收件人姓名）
     */
    public static void pushmail(String account, String password, String reciver, String name, String title, String content, String recipients) {
        String file = null;
        // 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
        String myEmailAccount = account;
        String myEmailPassword = password;

        // 网易163邮箱的 SMTP 服务器地址为: smtp.163.com
        //qq  smtp.qq.com
        String myEmailSMTPHost = "smtp.qq.com";

        // 收件人邮箱（替换为自己知道的有效邮箱）
        //  String receiveMailAccount = "1533047354@qq.com";

        // 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();                    // 参数配置
        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证

        // 开启 SSL 安全连接。
        // SMTP 服务器的端口 (非 SSL 连接的端口一般默认为 25, 可以不添加, 如果开启了 SSL 连接,
        //                  需要改为对应邮箱的 SMTP 服务器的端口, 具体可查看对应邮箱服务的帮助,
        //                  QQ邮箱的SMTP(SLL)端口为465或587, 其他邮箱自行去查看)
        final String smtpPort = "465";
        props.setProperty("mail.smtp.port", smtpPort);
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", smtpPort);


        // 2. 根据配置创建会话对象, 用于和邮件服务器交互qfkpjbixekpxbifj jzftpodbiotabhhf
        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);                                 // 设置为debug模式, 可以查看详细的发送 log

        // 3. 创建一封邮件
        MimeMessage message;
        try {
            message = createMimeMessage(session, myEmailAccount, reciver, name, title, content ,recipients);

            // 4. 根据 Session 获取邮件传输对象
            Transport transport = session.getTransport();

            // 5. 使用 邮箱账号 和 密码 连接邮件服务器, 这里认证的邮箱必须与 message 中的发件人邮箱一致, 否则报错
            transport.connect(myEmailAccount, myEmailPassword);

            // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
            transport.sendMessage(message, message.getAllRecipients());

            // 7. 关闭连接
            transport.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail, String name, String title, String content,String recipients) throws Exception {
        // 1. 创建一封邮件
        MimeMessage message = new MimeMessage(session);

        // 2. From: 发件人（昵称有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改昵称）
        message.setFrom(new InternetAddress(sendMail, name, "UTF-8"));

        // 3. To: 收件人（可以增加多个收件人、抄送、密送）
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, recipients, "UTF-8"));

        // 4. Subject: 邮件主题（标题有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改标题）
        message.setSubject(title, "UTF-8");

        // 5. Content: 邮件正文（可以使用html标签）（内容有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改发送内容）
        message.setContent(content, "text/html;charset=UTF-8");

        // 6. 设置发件时间
        message.setSentDate(new Date());

        // 7. 保存设置
        message.saveChanges();

        return message;
    }
}
