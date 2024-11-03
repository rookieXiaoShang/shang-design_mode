package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 11:29
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println("晚上到了");
        SmartAppliancesFacade.on();
        System.out.println("该睡觉了");
        SmartAppliancesFacade.off();
    }
}
