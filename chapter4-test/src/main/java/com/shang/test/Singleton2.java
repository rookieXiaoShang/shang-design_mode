package com.shang.test;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: shang-design_mode
 * @description: CAS方式实现单例模式
 * @author: Shang
 * @create: 2024-10-30 15:55
 * @version: 1.0
 **/
public class Singleton2 implements Serializable {
    // 首先都是要私有化构造器
    private Singleton2(){
        if(instance != null){
            throw new RuntimeException("非法访问！！！");
        }
    }
    private static Singleton2 instance = null;
    private static final AtomicReference<Singleton2> INSTANCE = new AtomicReference<>();
    public static Singleton2 getInstance(){
        while (true){
            Singleton2 instance = INSTANCE.get();
            if(null != instance) return instance;
            INSTANCE.compareAndSet(null,new Singleton2());
            return INSTANCE.get();
        }
    }
    // 注意返回值一定要是Object 否则就是方法重载 没有用了
    public Object readResolve(){
        return INSTANCE.get();
    }
}
