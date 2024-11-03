package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 黄灯
 * @author: Shang
 * @create: 2024-11-02 20:16
 * @version: 1.0
 **/
public class YellowLight implements ILightState{
    @Override
    public void toGreen(TrafficLight trafficLight) {
        System.out.println(trafficLight);
        trafficLight.setState(new GreenLight());
        System.out.println("绿灯亮起30秒");
    }

    @Override
    public void toYellow(TrafficLight trafficLight) {
        System.out.println(trafficLight);
        System.out.println("已经是黄灯，无需切换");
    }

    @Override
    public void toRed(TrafficLight trafficLight) {
        System.out.println(trafficLight);
        trafficLight.setState(new RedLight());
        System.out.println("红灯亮起60秒");
    }
    @Override
    public String toString() {
        return "Yellow Light";
    }
}
