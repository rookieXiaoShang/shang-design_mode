package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象中介者
 * @author: Shang
 * @create: 2024-11-03 20:15
 * @version: 1.0
 **/
public interface IMediator {
    // 就是同事想要实现的功能 只不过让终结者来进行具体的实现
    void apply(String key);
}
