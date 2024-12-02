package com.shang.test6;

import com.shang.test3.MyMethodIntercept;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @program: shang-design_mode
 * @description:
 * @author: Shang
 * @create: 2024-11-23 13:55
 * @version: 1.0
 **/
public class ProxyClassGenerate {
    public static MessageAction getProxy(MessageAction messageAction) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(messageAction.getClass());
        enhancer.setCallback(new MyHandler(messageAction));
        return (MessageAction) enhancer.create();
    }
}
