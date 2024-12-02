package com.shang.test5;

import java.lang.reflect.Proxy;

/**
 * @program: shang-design_mode
 * @description: 动态短信代理类
 * @author: Shang
 * @create: 2024-11-23 13:26
 * @version: 1.0
 **/
public class MessageProxy {
    public static IAction getProxy(IAction target){
        return  (IAction) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MyInvocationHandler(target)
        );
    }
}
