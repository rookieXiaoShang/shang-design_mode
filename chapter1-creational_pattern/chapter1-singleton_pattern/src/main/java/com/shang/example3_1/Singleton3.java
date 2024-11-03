package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 线程安全版懒汉式
 * @author: Shang
 * @create: 2024-10-25 10:13
 * @version: 1.0
 **/
public class Singleton3 {
    // 静态私有化属性
    private static Singleton3 instance = null;
    // 私有化改造方法
    private Singleton3() {

    }
    // 将实例的返回上锁 解决线程不安全问题 该方法只能串行执行 效率低
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
