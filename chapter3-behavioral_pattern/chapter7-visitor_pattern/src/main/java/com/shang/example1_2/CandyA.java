package com.shang.example1_2;
import java.time.LocalDate;

/**
 * @program: shang-design_mode
 * @description: 糖果
 * @author: Shang
 * @create: 2024-11-03 15:17
 * @version: 1.0
 **/
public class CandyA extends IProduct implements Acceptable{
    public CandyA(String name, LocalDate produce, Double price) {
        super(name, produce, price);
    }

    @Override
    public void accept(IVisitor visitor) {
        // 传入的visitor对象中有好多个方法名一致的重载方法 要传入this实现具体的调用
        visitor.visit(this);
    }
}
