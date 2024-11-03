package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 抽象水状态
 * @author: Shang
 * @create: 2024-11-03 10:14
 * @version: 1.0
 **/
public interface IWaterState {
    void toWater(TemperatureContext context);
    void toAir(TemperatureContext context);
    void toIce(TemperatureContext context);
}
