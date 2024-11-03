package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 20:23
 * @version: 1.0
 **/
public class Client {
    /*
    中介者模式具体成员：
    抽象中介者：维护一个同事类想要实现的方法模板 中介者本质就是替同事工作的
    具体中介者：实现该方法,可以引用同事类
    抽象同事：引用一个中介者，向中介者提要求，
    具体同事：实现提要求的具体业务方法

    符合的设计原则
    开闭原则 单一职责 迪米特 里氏替换原则 也有点依赖倒置原则
     */
    public static void main(String[] args) {
        // 申请一个中介者
        IMediator mediator = new Mediator();

        // 创建一个同事
        IColleague colleagueA = new ColleagueA(mediator);
        IColleague colleagueB = new ColleagueB(mediator);

        colleagueA.execute("想让中介者带给同事B一句祝福");
        colleagueB.execute("给同事A说已经收到了祝福");

    }
}
