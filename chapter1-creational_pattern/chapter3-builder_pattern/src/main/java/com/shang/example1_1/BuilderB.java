package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 创建者B
 * @author: Shang
 * @create: 2024-10-29 17:30
 * @version: 1.0
 **/
public class BuilderB implements AbstractBuilder{
    @Override
    public void buildFrame() {
        bile.setFrame("铁架子");
    }

    @Override
    public void buildSeat() {
        bile.setSeat("塑料坐垫");
    }

    @Override
    public Bike createBike() {
        return bile;
    }
}
