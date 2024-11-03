package com.shang.test;

import com.shang.example6_1.Singleton6;
import com.shang.example7_1.Singleton7;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: shang-design_mode
 * @description: 测试单例模式
 * @author: Shang
 * @create: 2024-10-25 11:22
 * @version: 1.0
 **/
public class Client {
    // 反射对单例模式的破坏
    @Test
    public void test6_1_1(){
        // 获取类对象
        Class<Singleton6> singleton6Class = Singleton6.class;
        // 获取无参构造器
        try {
            Constructor<Singleton6> declaredConstructor = singleton6Class.getDeclaredConstructor(null);
             declaredConstructor.setAccessible(true);
            Singleton6 singleton1 = declaredConstructor.newInstance();
            Singleton6 singleton2 = declaredConstructor.newInstance();
            System.out.println(singleton2 == singleton1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // 测试序列化对于单例模式的破坏
    @Test
    public void test6_1_2() throws Exception{

        //序列化对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(Singleton6.getInstance());

        //序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton6 singleton6 = (Singleton6) ois.readObject();

        System.out.println(singleton6);
        System.out.println(singleton6.getInstance());

        //判断是否是同一个对象
        System.out.println(singleton6.getInstance() == singleton6); //破坏之后 false 否则单例创建的是同一个类
    }

    // 测试枚举类型
    @Test
    public void test7_1(){
        Singleton7 instance = Singleton7.getInstance();
        System.out.println(instance.getDada());
        System.out.println(instance);
    }

}
