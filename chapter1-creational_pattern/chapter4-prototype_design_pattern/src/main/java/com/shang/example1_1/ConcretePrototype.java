package com.shang.example1_1;

import java.io.Serializable;

/**
 * @program: shang-design_mode
 * @description: 浅克隆实现
 * @author: Shang
 * @create: 2024-10-29 19:59
 * @version: 1.0
 **/
public class ConcretePrototype implements Cloneable {
    public ConcretePrototype() {
        System.out.println("具体的原型对象创建完成!");
    }

    // 重写克隆方法 点到为止 若类中还存在引用类型 则不会再克隆了
    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        System.out.println("原型对象复制！！！");
        return (ConcretePrototype)super.clone();
    }
}
