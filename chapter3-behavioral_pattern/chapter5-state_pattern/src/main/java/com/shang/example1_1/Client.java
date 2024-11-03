package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-02 19:20
 * @version: 1.0
 **/
public class Client {
    /*
    对于状态的创建可以考虑使用单例模式 但是可能导致创建不灵活的问题
    具体的成员测试：对于这两个成员都可以考虑重写toString方法
    抽象状态：抽取一种状态的共性方法，一般是状态之间的转换，注意共性方法中一定要传入context作为拥有关系
    context类：维护一个state作为引用，并且在其中有着真正的业务方法

    符合的设计原则：
    开闭原则但是支持不太好，修改state将要修改所有的实现类 单一职责 里氏替换原则 迪米特法则
    也可能出现接口分离 对于依赖倒置体现不明显
    但是context与state之间的耦合程度较高
     */
    public static void main(String[] args) {
        Context context = new Context();

        IState state1 = new StateA();
        state1.handle(context);
        System.out.println(context.getCurrentState().toString());

        System.out.println("========================");

        IState state2 = new StateB();
        state2.handle(context);
        System.out.println(context.getCurrentState().toString());
    }
}
