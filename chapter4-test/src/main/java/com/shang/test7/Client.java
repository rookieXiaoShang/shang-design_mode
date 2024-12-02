package com.shang.test7;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-28 16:57
 * @version: 1.0
 **/
public class Client {
    /*
    * 关于动态代理总共有三个对象
    * 代理接口：目标类
    * 接口实现类：真实类
    * 代理类
    * */
    public static void main(String[] args) {
        IMessage proxy = ProxyMessageService.getProxy(new MessageService());
        proxy.action("你好！！！");
    }
}
