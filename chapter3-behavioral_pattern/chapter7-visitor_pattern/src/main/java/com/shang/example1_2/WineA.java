package com.shang.example1_2;


import java.time.LocalDate;

/**
 * @program: shang-design_mode
 * @description: 酒
 * @author: Shang
 * @create: 2024-11-03 15:17
 * @version: 1.0
 **/
public class WineA extends IProduct implements Acceptable {
    // 实现的Acceptable接口是关键中的关键
    public WineA(String name, LocalDate produce, Double price) {
        super(name, produce, price);
    }

    // 这里要使用多态
    @Override
    public void accept(IVisitor visitor) {
        // 传入的visitor对象中有好多个方法名一致的重载方法 要传入this实现具体的调用
        visitor.visit(this);
    }
}
