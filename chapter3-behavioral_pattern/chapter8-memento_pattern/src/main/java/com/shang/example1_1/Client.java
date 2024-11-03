package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 16:41
 * @version: 1.0
 **/
public class Client {
    /*
    备忘录具体成员角色:
    原始发起者Originator：就是原始类，维护一个createMemento和restore方法来创建备忘录和回复数据 state属性标识原始类
    备忘录Memento：基本结构和发起者类似 有一个state属性辨识备忘录
    负责人Caretaker：创建一个集合可以存储不同的memento对象

    符合的设计原则：
    可能有个迪米特法则，但是还不一定明显，单一职责原则，开闭也不好说啊，依赖倒置原则肯定没有，接口分离无稽之谈 里氏替换原则无从谈起

    明天要实现一个系统上线回滚的操作业务
     */
    public static void main(String[] args) {
        //创建发起人对象
        Originator originator = new Originator();
        originator.setId("1");
        originator.setName("spike");
        originator.setPhone("13512341234");
        System.out.println("=============" + originator);

        //创建负责人对象,并保存备忘录对象
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.create());

        //修改
        originator.setName("update");
        System.out.println("=============" + originator);

        //从负责人对象中获取备忘录对象,实现撤销
        originator.restore(caretaker.getMemento());
        System.out.println("=============" + originator);
    }
}
