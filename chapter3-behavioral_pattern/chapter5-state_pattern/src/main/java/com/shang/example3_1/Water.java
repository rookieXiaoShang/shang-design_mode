package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 水状态的实现类
 * @author: Shang
 * @create: 2024-11-03 10:21
 * @version: 1.0
 **/
public class Water implements IWaterState{
    // 是否可以状态的初始化设置为一个单例模式 这样在切换状态的时候不需要频繁的创建多个对象
    @Override
    public void toWater(TemperatureContext context) {
        System.out.println("water is water，Don't switch");
    }

    @Override
    public void toAir(TemperatureContext context) {
        System.out.println("temperature is high,water become air!");
        context.setState(new WaterAir());
    }

    @Override
    public void toIce(TemperatureContext context) {
        System.out.println("temperature is low,water become ice!");
        context.setState(new Ice());
    }
    // toString方法
    @Override
    public String toString() {
        return "Water";
    }
}
