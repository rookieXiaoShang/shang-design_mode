package com.shang.example2_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: shang-design_mode
 * @description: 利用jdk实现动态代理类的生成
 * @author: Shang
 * @create: 2024-10-30 17:46
 * @version: 1.0
 **/
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }
    // 创建一个代理对象proxy
    public Object createProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("发送前：");
                        method.invoke(target, args);
                        System.out.println("发送后：");
                        return null;
                    }
                });// 这实际上是一个内部实现类
    }
}
