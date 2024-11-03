package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 测试建造者模式
 * @author: Shang
 * @create: 2024-10-29 19:37
 * @version: 1.0
 **/
public class MainApp {
    public static void main(String[] args) {
        RabbitMQClient instance = new RabbitMQClient.Builder().setHost("192.168.52.123").setMode(2).setExchange("text-exchange")
                .setPort(5672).setDurable(true).builder();
        instance.sendMessage("Hello World");
        System.out.println("信息发送成功！Instance实例化成功！！！");
        System.out.println("instance = " + instance);
    }
}
