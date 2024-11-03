package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 非共享的享原对象
 * @author: Shang
 * @create: 2024-10-31 15:14
 * @version: 1.0
 **/
public class UNConcreteFlyweight implements Flyweight{
    private String intrinsicState;
    public UNConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }
    @Override
    public void operation(String extrinsicState) {
        System.out.println("=== 使用不共享对象,内部状态: " + intrinsicState +",外部状态: " + extrinsicState);
    }
}
