package com.shang.example8_1;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: shang-design_mode
 * @description: CAS实现单例模式
 * @author: Shang
 * @create: 2024-10-25 16:23
 * @version: 1.0
 **/
public class Singleton8 {
    private static final AtomicReference<Singleton8> INSTANCE = new AtomicReference<>();

    private static Singleton8 instance;

    private Singleton8() {
    }

    public static final Singleton8 getInstance() {
        for (; ; ) {
            Singleton8 instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton8());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton8.getInstance());
        System.out.println(Singleton8.getInstance());
    }
}
