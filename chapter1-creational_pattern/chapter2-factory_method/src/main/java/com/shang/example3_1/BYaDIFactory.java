package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 比亚迪公司
 * @author: Shang
 * @create: 2024-10-30 16:08
 * @version: 1.0
 **/
public class BYaDIFactory implements CarFactory{
    @Override
    public ICar makeCar() {
        return new BYaDiCar();
    }

    @Override
    public IBus makeBus() {
        return new BYaDiBus();
    }
}
