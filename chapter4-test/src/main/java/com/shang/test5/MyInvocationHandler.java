package com.shang.test5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: shang-design_mode
 * @description: 自定义处理类接口
 * @author: Shang
 * @create: 2024-11-23 13:28
 * @version: 1.0
 **/
public class MyInvocationHandler implements InvocationHandler {
    // 传入的类型是未知的
    private Object target;
    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行操作前");
        Object invoke = method.invoke(target, args);
        System.out.println("执行操作后");
        // 代理方法的返回值是null
        return invoke;
    }
}
