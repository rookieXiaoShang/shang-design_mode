package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 具体建造者A
 * @author: Shang
 * @create: 2024-10-29 17:24
 * @version: 1.0
 **/
public class BuilderA implements AbstractBuilder{
    @Override
    public void buildFrame() {
        bile.setFrame("碳纤维骨架");
    }

    @Override
    public void buildSeat() {
        bile.setSeat("真皮坐垫");
    }

    @Override
    public Bike createBike() {
        return bile;
    }
}
