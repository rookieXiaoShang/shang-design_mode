package com.shang.test6;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-23 13:54
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        MessageAction proxy = ProxyClassGenerate.getProxy(new MessageAction());
        proxy.doAction();
    }
}
