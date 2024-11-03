package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 水状态的实现类
 * @author: Shang
 * @create: 2024-11-03 10:21
 * @version: 1.0
 **/
public class Ice implements IWaterState{
    @Override
    public void toWater(TemperatureContext context) {
        System.out.println("temperature is high,ice switch water");
        context.setState(new Water());
    }

    @Override
    public void toAir(TemperatureContext context) {
        System.out.println("ice don't switch Air");
    }

    @Override
    public void toIce(TemperatureContext context) {
        System.out.println("ice is ice");
    }
    // toString方法
    @Override
    public String toString() {
        return "Ice";
    }
}
