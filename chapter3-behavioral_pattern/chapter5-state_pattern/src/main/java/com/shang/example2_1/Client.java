package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-02 20:09
 * @version: 1.0
 **/
public class Client {
    /*
    测试 红绿灯之间的转换 注意黄灯可以转换为绿红灯 绿红灯之间不能直接转换 要结果黄灯作为中间状态
     */
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        light.setState("绿");
        light.toGreen();
        light.toYellow();
        light.toGreen();
    }
}
