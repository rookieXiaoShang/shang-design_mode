package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-01 10:05
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        IMessageService proxy = ProxyFactory0.getProxy(new MessageServiceA());
        proxy.sendMessage("yong","hello jdk");
    }
}
