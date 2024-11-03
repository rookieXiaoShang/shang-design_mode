package com.shang.test3;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: shang-design_mode
 * @description: 系统方法拦截接口的实现类（关键在于重写intercept方法）
 * @author: Shang
 * @create: 2024-11-01 09:34
 * @version: 1.0
 **/
public class MyMethodIntercept implements MethodInterceptor {
    // 也是要维护一个目标类的
    private Object target;

    public MyMethodIntercept(Object target) {
        this.target = target;
    }

    /**
     * 也就是Enhance增强类中的回调函数
     * @param o 目标类
     * @param method 目标类的方法
     *      我的理解是intercept法中没有传入接口 所以不好找方法 所以只能传入目标类对象和他的方法列表
     * @param objects 传入的参数列表
     * @param methodProxy proxy的方法执行器
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理发送短信前！");
        Object invoke = methodProxy.invoke(target, objects);
        System.out.println("cglib动态代理发送短信后！");
        return invoke;
    }
}
