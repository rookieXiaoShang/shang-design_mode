package com.shang.test;

import java.io.Serializable;

/**
 * @program: shang-design_mode
 * @description: 测试单例模式
 * @author: Shang
 * @create: 2024-10-29 09:59
 * @version: 1.0
 **/
public class Singleton implements Serializable {
    // 一定要私有化构造器 防止用户自己new实例化对象
    private Singleton(){

    }
    public static class SingletonHandler{
        private static Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHandler.instance;
    }
}
