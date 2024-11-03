package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象建造者
 * @author: Shang
 * @create: 2024-10-29 17:19
 * @version: 1.0
 **/
// 这是重点 接口中的final bike是一个引用属性 所以不变的只是引用地址 所以可以使用接口或者是抽象类作为builder父类
public interface AbstractBuilder {
    // 维护一个具体产品 默认修饰为public static final
    Bike bile = new Bike();

    // 默认修饰为public abstract
    void buildFrame();
    void buildSeat();
    Bike createBike();
}
