package com.shang.test3;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-01 09:42
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        MessageService instance = ProxyFactory.getInstance(new MessageService());
        instance.sendMessage("shang","hello cglib");
    }
}
