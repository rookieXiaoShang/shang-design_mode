package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 共享的享原对象
 * @author: Shang
 * @create: 2024-10-31 15:09
 * @version: 1.0
 **/
public class ConcreteFlyweight implements Flyweight{
    // 内部状态是一个成员属性 所有相享原对象的内部属性是一致的
    private String intrinsicState;
    public ConcreteFlyweight(String intrinsic) {
        this.intrinsicState = intrinsic;
    }
    // 操作的是外部状态 外部状态由外部来设置 同一个享原对象的外部状态是不一样的
    @Override
    public void operation(String extrinsicState) {
        // 实现业务方法
        System.out.println("=== 享元对象内部状态" + intrinsicState +",外部状态:" + extrinsicState);
    }
}
