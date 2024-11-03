package com.shang.example2_2;

import java.lang.reflect.Proxy;

/**
 * @program: shang-design_mode
 * @description: 代理类工厂
 * @author: Shang
 * @create: 2024-11-01 10:06
 * @version: 1.0
 **/
public class ProxyFactory0 {
    public static IMessageService getProxy(IMessageService service){
        return (IMessageService) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new MyInvocationHandler(service)
        );
    }
}
