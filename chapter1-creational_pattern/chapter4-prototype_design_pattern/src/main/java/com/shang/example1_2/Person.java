package com.shang.example1_2;

import java.io.Serializable;

/**
 * @program: shang-design_mode
 * @description: 引用类型
 * @author: Shang
 * @create: 2024-10-29 20:08
 * @version: 1.0
 **/
public class Person implements Serializable,Cloneable{
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 一个类要想实现深克隆 就要求他的引用属性都要重写Object的克隆方法
    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }
}
