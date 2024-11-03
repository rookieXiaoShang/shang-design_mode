package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-01 10:17
 * @version: 1.0
 **/
public class Client {
    /*
    测试策略者模式的具体成员
    抽象策略：给出策略的共性方法
    具体策略：实现抽象策略，完成自己独特的职责
    上下文类：内部维护一个抽象策略 构造器设置具体策略 利用多态调用具体的策略方法

    对于原则的使用：
    依赖倒置原则（context依赖于抽象策略 具体策略也依赖于抽象策略）
    里氏替换原则（context构造器传入具体的策略类）
    单一职责（每个具体策略都完成相似但又独立的功能）
    开闭（增加策略就是增加策略类的个数）
    上下文类也可以看做一个迪米特法则的实现（代理使用策略 相当于放弃了继承或者实现关系 而是使用了组合关系）
    要是一个抽象策略中有多个抽象方法 可能还会出现接口分离原则

    对于具体策略的选择 可以使用工厂方法替换if - else 工厂方法中维护一个hashmap来保存策略
     */
    public static void main(String[] args) {
        // 执行策略A
        Context context = new Context(new StrategyA());
        context.doOperator();
        System.out.println("==================");
        // 执行策略B
        Context context1 = new Context(new StrategyB());
        context1.doOperator();
    }
}
