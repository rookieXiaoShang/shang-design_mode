package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 饿汉式
 * @author: Shang
 * @create: 2024-10-25 10:07
 * @version: 1.0
 **/
public class Singleton1 {
    // 将属性私有化
    private static Singleton1 instance;
    // 构造方法私有化
    private Singleton1(){

    }
    // 返回实例化对象 要使用的是静态方法
    public static Singleton1 getInstance() {
        return instance = new Singleton1();
    }
}
