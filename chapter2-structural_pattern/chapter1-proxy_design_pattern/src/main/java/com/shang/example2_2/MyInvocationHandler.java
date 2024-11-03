package com.shang.example2_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: shang-design_mode
 * @description: jdk中调用处理者接口的实现类
 * @author: Shang
 * @create: 2024-11-01 09:44
 * @version: 1.0
 **/
public class MyInvocationHandler implements InvocationHandler {
    // 维护一个目标类 目标类的类型不确定 使用Object接收是最好的
    private Object target;
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 下列所有的参数都是和动态代理类相关的参数
     * @param proxy the proxy instance that the method was invoked on
     *
     * @param method the {@code Method} instance corresponding to
     * the interface method invoked on the proxy instance.  The declaring
     * class of the {@code Method} object will be the interface that
     * the method was declared in, which may be a superinterface of the
     * proxy interface that the proxy class inherits the method through.
     *
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance,
     * or {@code null} if interface method takes no arguments.
     * Arguments of primitive types are wrapped in instances of the
     * appropriate primitive wrapper class, such as
     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理发送短信前！");
        method.invoke(target, args);
        System.out.println("jdk动态代理发送短信后！");
        /* 这里为什么要返回一个null */
        // 返回null是因为在目标类的方法返回值void 要是目标类有返回值 要返回对应对的返回值类型
        return null;
    }
}
