package com.shang.example3_1;

import net.sf.cglib.proxy.Enhancer;

/**
 * @program: shang-design_mode
 * @description: 代理类的创建工厂
 * @author: Shang
 * @create: 2024-11-01 09:38
 * @version: 1.0
 **/
public class ProxyFactory {
    public static MessageService getInstance(MessageService service){
        // 创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        // 设置被代理类的类加载器
        enhancer.setClassLoader(service.getClass().getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(service.getClass());
        // 设置方法拦截器 也就是一个回调函数
        enhancer.setCallback(new MyMethodIntercept(service));
        // 直接再返回的时候进行强转
        return (MessageService)enhancer.create(); // 创建代理类
    }
}
