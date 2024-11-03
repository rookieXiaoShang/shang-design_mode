package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 红灯
 * @author: Shang
 * @create: 2024-11-02 20:16
 * @version: 1.0
 **/
public class RedLight implements ILightState{
    @Override
    public void toGreen(TrafficLight trafficLight) {
        System.out.println(trafficLight);
        System.out.println("红灯不能直接转换为绿灯！！！");
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
        System.out.println("已经是红灯，无需切换");
    }
    @Override
    public String toString() {
        return "Red Light";
    }
}
