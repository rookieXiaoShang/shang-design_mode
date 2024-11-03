package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 抽象汽车工厂
 * @author: Shang
 * @create: 2024-10-30 16:02
 * @version: 1.0
 **/
public interface CarFactory {
    ICar makeCar();
    IBus makeBus();
}
