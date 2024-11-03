package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 09:52
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println("测试一层修饰器=========");
        DecoratorA decoratorA = new DecoratorA(new BasicComponent());
        decoratorA.operation();

        System.out.println("测试多层记得修饰器！！！============");
        DecoratorAA decoratorAA = new DecoratorAA(new BasicComponent());
        decoratorAA.operation();
    }
}
