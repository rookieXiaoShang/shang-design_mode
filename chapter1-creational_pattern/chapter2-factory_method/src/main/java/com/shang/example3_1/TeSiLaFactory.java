package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 特斯拉公司
 * @author: Shang
 * @create: 2024-10-30 16:09
 * @version: 1.0
 **/
public class TeSiLaFactory implements CarFactory{
    @Override
    public ICar makeCar() {
        return new TeSiLaCar();
    }

    @Override
    public IBus makeBus() {
        return new TeSiLaBus();
    }
}
