package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 灯的状态接口
 * @author: Shang
 * @create: 2024-11-02 20:13
 * @version: 1.0
 **/
public interface ILightState {
    void toGreen(TrafficLight trafficLight);
    void toYellow(TrafficLight trafficLight);
    void toRed(TrafficLight trafficLight);
}
