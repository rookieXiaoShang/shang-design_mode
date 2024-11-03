package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 15:22
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight a1 = factory.getFlyweight("A");
        Flyweight a2 = factory.getFlyweight("A");
        a2.operation("对于A的第一次操作");
        a1.operation("对于A的第二次操作");
        System.out.println("判断两次对象A是否为同一对象："+(a1 == a2));


        System.out.println("==================");
        Flyweight d = factory.getFlyweight("D");
        d.operation("对于D的操作！！");
    }
}
