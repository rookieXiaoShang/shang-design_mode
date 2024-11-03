package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-30 17:43
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        // 直接调用代理类 要传入真实类
        ProxyMail proxyMail = new ProxyMail(new RealMail());
        proxyMail.sendMail("设计模式YY！！！");
    }
}
