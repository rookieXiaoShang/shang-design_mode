package com.shang.test5;

/**
 * @program: shang-design_mode
 * @description: 测试客户端
 * @author: Shang
 * @create: 2024-11-23 13:33
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        IAction proxy = MessageProxy.getProxy(new MessageService());
        proxy.doAction();
    }
}
