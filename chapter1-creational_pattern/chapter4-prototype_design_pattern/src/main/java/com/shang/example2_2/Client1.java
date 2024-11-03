package com.shang.example2_2;

import com.shang.example2_1.AdvTemplate;
import java.util.Random;

/**
 * @program: shang-design_mode
 * @description: 客户类
 * @author: Shang
 * @create: 2024-10-29 20:45
 * @version: 1.0
 **/
public class Client1 {
    //发送信息的是数量,这个值可以从数据库获取
    private static int MAX_COUNT = 6;

    //发送邮件
    public static void sendMail(Mail1 mail){
        System.out.println("标题: " + mail.getSubject() + "\t收件人: " + mail.getReceiver()
                + "\t..发送成功!");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        //模拟邮件发送
        int i = 0;

        //把模板定义出来,数据是从数据库获取的
        Mail1 mail = new Mail1(new AdvTemplate());
        mail.setTail("xxx银行版权所有");
        while(i < MAX_COUNT){
            // 首先克隆一封邮件 让每个邮件都有自己的实体
            mail = mail.clone();
            //下面是每封邮件不同的地方
            mail.setAppellation(" 先生 (女士)");
            Random random = new Random();
            int num = random.nextInt(9999999);
            mail.setReceiver(num+"@"+"liuliuqiu.com");
            //发送 邮件
            sendMail(mail);
            i++;
        }
    }
}
