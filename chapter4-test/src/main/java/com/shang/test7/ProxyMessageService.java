package com.shang.test7;

import java.lang.reflect.Proxy;

/**
 * @program: shang-design_mode
 * @description: 动态代理类 这才是代理类
 * @author: Shang
 * @create: 2024-11-28 16:48
 * @version: 1.0
 **/
public class ProxyMessageService {
    public static IMessage getProxy(IMessage messageServer){
        return (IMessage) Proxy.newProxyInstance(
                messageServer.getClass().getClassLoader(),
                messageServer.getClass().getInterfaces(),
                new MyInvocationHandler(messageServer)
        );
    }
}
