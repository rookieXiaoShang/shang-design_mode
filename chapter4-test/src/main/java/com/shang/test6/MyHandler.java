package com.shang.test6;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: shang-design_mode
 * @description: 接口实现类
 * @author: Shang
 * @create: 2024-11-23 13:51
 * @version: 1.0
 **/
public class MyHandler implements MethodInterceptor {
    private Object target;
    public MyHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("动作执行前！！！");
        methodProxy.invoke(target,objects);
        System.out.println("动作执行后！！！");
        return null;
    }
}
