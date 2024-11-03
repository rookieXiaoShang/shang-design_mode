package com.shang.test4;

/**
 * @program: shang-design_mode
 * @description: 短信发送接口
 * @author: Shang
 * @create: 2024-11-01 09:50
 * @version: 1.0
 **/
public interface IMessageService {
    void sendMessage(String uid,String message);
}
