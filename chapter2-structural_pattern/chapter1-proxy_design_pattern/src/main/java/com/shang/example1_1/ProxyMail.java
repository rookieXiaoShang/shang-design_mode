package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 代理mail类
 * @author: Shang
 * @create: 2024-10-30 17:40
 * @version: 1.0
 **/
public class ProxyMail implements IMail{
    // 维护一个realClass
    private IMail mail;
    public ProxyMail(IMail mail) {
        this.mail = mail;
    }

    @Override
    public void sendMail(String message) {
        String prefix = "邮件主题 == ";
        message = prefix + message;
        mail.sendMail(message);
        System.out.println("发送邮件结束");
    }
}
