package com.shang.example4_1;

/**
 * @program: shang-design_mode
 * @description: 双重校验式 解决线程安全懒汉式运行慢的问题
 * @author: Shang
 * @create: 2024-10-25 10:17
 * @version: 1.0
 **/
public class Singleton4 {
    /*
    * 对象实例化过程大概分为三部
    * 1给对象分配内存空间 2初始化对象（调用构造函数等等） 3将对象指向内存空间（这一步就不是null）
    *
    * 但是多线程执行时 线程可能执行顺序为1 3 2，在执行到3时对象已经不为空了，
    * 此时有其他线程判断实例对象不为null，可能会直接调用实例对象，但是对象还未初始化就会报错。
    * */
    // 私有静态化属性 volatile关键字表示多个线程之间的运行是彼此可见的 同时禁止了指令重新排列
    private static volatile Singleton4 instance;

    // 私有化改造方法
    private Singleton4() {

    }

    // 返回实例化对象
    public static Singleton4 getInstance() {
        // 由于volatile关键字的限制 可以首先判断对象是否为null 为null就一定是未初始化 可以加锁
        // 不为null可以直接返回实例
        if(instance == null) {
            synchronized (Singleton4.class){
                // 抢到锁再次判断是为了防止多线程情况下已经有人初始化完成了
                if(instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}
