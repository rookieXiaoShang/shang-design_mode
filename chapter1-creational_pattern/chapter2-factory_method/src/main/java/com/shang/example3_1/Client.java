package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 客户端测试抽象工厂方法
 * @author: Shang
 * @create: 2024-10-30 16:10
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        CarFactory factory = CarFactoryMap.createFactory(2);
        IBus iBus = factory.makeBus();
        ICar iCar = factory.makeCar();
        iBus.driver();
        iCar.run();
    }
}
