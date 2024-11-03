package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 懒汉式
 * @author: Shang
 * @create: 2024-10-25 10:09
 * @version: 1.0
 **/
public class Singleton2 {
    // 属性私有静态化
    private static Singleton2 instance = null;
    // 私有化构造方法
    private Singleton2() {

    }
    // 使用静态方法完成实例化
    public static Singleton2 getInstance() {
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
