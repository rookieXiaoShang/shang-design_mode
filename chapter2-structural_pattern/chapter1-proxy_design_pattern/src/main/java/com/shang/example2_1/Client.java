package com.shang.example2_1;

import com.shang.example1_1.IMail;
import com.shang.example1_1.RealMail;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-30 17:53
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new RealMail());
        IMail proxy = (IMail)factory.createProxy();
        proxy.sendMail("你好！！！");
    }
}
