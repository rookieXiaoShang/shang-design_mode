package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 具体中介者
 * @author: Shang
 * @create: 2024-11-03 20:16
 * @version: 1.0
 **/
public class Mediator implements IMediator{
    @Override
    public void apply(String key) {
        System.out.println("中介者执行了key = "+key+"业务！");
    }
}
