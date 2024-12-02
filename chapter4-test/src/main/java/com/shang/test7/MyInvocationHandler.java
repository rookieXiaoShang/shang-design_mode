package com.shang.test7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: shang-design_mode
 * @description: 代理接口实现类
 * @author: Shang
 * @create: 2024-11-28 16:52
 * @version: 1.0
 **/
public class MyInvocationHandler implements InvocationHandler {
    // 维护一个目标类 实际上是目标接口 使用多态定位到真实类
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始发送短信");
        // 这里执行的实目标类的方法 实际上MyInvocationHandler构造器传入的是IMessage接口的实现类 也就是真实类 利用了面向对象的多态性质
        Object invoke = method.invoke(target, args); // Object是方法的执行结果 但是action方法返回值类型为null 所以返回一个null即可
        System.out.println("短信发送成功！！！");
        return null;
    }
}
