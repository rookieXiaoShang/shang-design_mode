package com.shang.test;

import java.io.Serializable;

/**
 * @program: shang-design_mode
 * @description: 饿汉式
 * @author: Shang
 * @create: 2024-10-30 15:43
 * @version: 1.0
 **/
public class Singleton1 implements Serializable {
    // 不会延时加载
    private volatile static Singleton1 instance = null;
    // 防止反射
    private Singleton1(){
        if(instance != null){
            throw new RuntimeException("非法访问！！！");
        }
    }
    public static Singleton1 getInstance(){
        if(instance == null){
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
    // 防止序列化带来的影响 注意写成Object
    public Object readResolve(){
        return instance;
    }
}
