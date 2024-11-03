package com.shang.example6_1;

import java.io.Serializable;

/**
 * @program: shang-design_mode
 * @description: 反射对于单例模式的破坏 序列化对于单例模式的破坏(本质上还是反射对于单例模式的破坏 低层直接调用newInstance) 如何防止呢
 * @author: Shang
 * @create: 2024-10-25 11:19
 * @version: 1.0
 **/
public class Singleton6 implements Serializable {
    // 防止反射对于单例模式的破坏
    private Singleton6(){
        // 由于实例是static有唯一性 可以直接判断Instance是否为null来防止反射对于实例化的破坏
        // 不能直接查看静态内部类的instance属性 因为一定是被实例化的 而是要查看getInstance方法
        if(Singleton6.getInstance() != null){
            // return; 直接return也会创建新实例 创建的不是static的实例 而是普通的对象 只能抛出异常终止
            throw new RuntimeException("不容许非法访问");
        }
    }
    private static class Singleton6Handle{
        private static Singleton6 instance = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return Singleton6Handle.instance;
    }

    // 解决序列化对单例模式的破坏 细节中的细节：要求返回值必须是Object(否则会发生方法重载 读取不到该方法) 方法名都要是确定的
    public Object readResolve(){
        return Singleton6Handle.instance;
    }
}
