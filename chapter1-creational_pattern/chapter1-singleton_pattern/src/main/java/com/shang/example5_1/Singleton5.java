package com.shang.example5_1;

/**
 * @program: shang-design_mode
 * @description: 静态内部类单例模式（懒汉式单例模式）
 * @author: Shang
 * @create: 2024-10-25 10:33
 * @version: 1.0
 **/
public class Singleton5 {
    // 私有化构造方法
    private Singleton5() {

    }
    // 设置静态内部类
    private static class Singleton6Holder {
        private static Singleton5 instance = new Singleton5();
    }
    // 返回实例对象 静态是为了Singleton在无法使用构造方法的情况下让外界访问到此方法
    public static Singleton5 getInstance() {
        return Singleton6Holder.instance;
    }
}
