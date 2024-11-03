package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 17:50
 * @version: 1.0
 **/
public class Client {
    /*
    测试观察者方法的具体成员：
    抽象观察者：共性方法update() 该方法是观察者观察到特定现象要执行的业务逻辑
    具体观察者：实现update()方法 也可以存在其他业务方法
    抽象观察者管理：维护一个观察者集合 对观察者进行subscribe unsubscribe 以及notifyObserver行为操作
    具体观察者管理：实现抽象观察者管理

    遵循的设计原则：
    迪米特法则：观察者管理维护了一个观察者集合 实现了组合关系 代理观察者实现他们具体的功能
    开闭原则：对修改关闭 对扩展开放
    单一职责原则：一种观察者实现一种行为
    依赖倒置原则：具体观察者和观察者管理都依赖于抽象观察者
    里氏替换原则原则：就是多态
     */
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserverA());
        subject.attach(new ConcreteObserverB());
        subject.notifyObservers();
    }
}
