package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 绿灯
 * @author: Shang
 * @create: 2024-11-02 20:17
 * @version: 1.0
 **/
public class GreenLight implements ILightState{
    @Override
    public void toGreen(TrafficLight trafficLight) {
        System.out.println(trafficLight);
        System.out.println("已经是绿灯无需转换！！！");
    }

    @Override
    public void toYellow(TrafficLight trafficLight) {
        System.out.println(trafficLight);
        trafficLight.setState(new YellowLight());
        System.out.println("黄灯亮起5秒");
    }

    @Override
    public void toRed(TrafficLight trafficLight) {
        System.out.println(trafficLight);
        System.out.println("绿灯不能直接转换为红灯");
    }

    @Override
    public String toString() {
        return "Green Light";
    }
}
