package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 真正的mail类
 * @author: Shang
 * @create: 2024-10-30 17:40
 * @version: 1.0
 **/
public class RealMail implements IMail{
    @Override
    public void sendMail(String message) {
        System.out.println("发送信息："+message);
    }
}
