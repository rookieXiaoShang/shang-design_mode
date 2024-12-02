package com.shang.test5;

/**
 * @program: shang-design_mode
 * @description: 短信谈话
 * @author: Shang
 * @create: 2024-11-23 13:25
 * @version: 1.0
 **/
public class MessageService implements IAction{
    @Override
    public void doAction() {
        System.out.println("开始发送短信！！！");
    }
}
