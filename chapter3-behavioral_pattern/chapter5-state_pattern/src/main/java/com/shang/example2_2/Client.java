package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-02 20:29
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToYellowLight();
        trafficLight.switchToGreenLight();
        trafficLight.switchToRedLight();
    }
}
