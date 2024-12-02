package com.shang.test7;

/**
 * @program: shang-design_mode
 * @description: 动态代理接口实现类（真实类）
 * @author: Shang
 * @create: 2024-11-28 16:50
 * @version: 1.0
 **/
public class MessageService implements IMessage{

    @Override
    public void action(String message) {
        System.out.println("message = " + message);
    }
}
