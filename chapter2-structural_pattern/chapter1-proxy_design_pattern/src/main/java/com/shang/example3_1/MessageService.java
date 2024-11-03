package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 短信发送服务
 * @author: Shang
 * @create: 2024-11-01 09:32
 * @version: 1.0
 **/
public class MessageService {
    public void sendMessage(String uid,String message) {
        System.out.println("uid = " + uid + "的用户, 发送message为：" + message);
    }
}
