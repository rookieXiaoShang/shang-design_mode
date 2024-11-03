package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 指挥建造者类
 * @author: Shang
 * @create: 2024-10-29 17:21
 * @version: 1.0
 **/
public class Director {
    // 维护一个建造者类
    private AbstractBuilder builder;
    // 构造器初始化
    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }
    // 指挥创建复杂对象
    public Bike constructBike() {
        builder.buildFrame();
        builder.buildSeat();
        Bike bike = builder.createBike();
        return bike;
    }
}
