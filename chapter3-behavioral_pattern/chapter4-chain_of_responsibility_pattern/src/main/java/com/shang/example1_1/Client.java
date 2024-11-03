package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-01 20:34
 * @version: 1.0
 **/
public class Client {
    /*
    责任链模式的具体成员：
    抽象处理者：维护一个IHandler作为next者  设置next要返回一个this（this还要调用自己的业务逻辑 对于next的调用交给this的业务逻辑控制） 获取next要返回IHandler中的next属性
    具体处理者：实现handler中的处理方法即可 同时在业务方法中通过successor是否为null 判断责任链是否执行 注意调用getNext() 无论是否说明super 都调用的是父类方法 子类未重写getNext方法

    符合的设计模式：
    单一职责 开闭原则 迪米特法则 里氏替换原则

    什么叫锁链 每一个除了开头和结尾的链子扣外 其他所有的链扣前面牵一个后面拉一个
    对于JAVA来说就是 handler1.next(handler2) handler2.next(handler3) 才能成为handler1<--->handler2<--->handler3的链扣
    另一种初始化方式：注意.appendNext的位置
    IAuthHandler handler = new AuthHandler3("开发者小尚","1003")
                .appendNext(new AuthHandler2("王经理","1002")
                        .appendNext(new AuthHandler1("周老板","1001")));
     */
    public static void main(String[] args) {
        RequestData data = new RequestData("ABC");
        IHandler handler1 = new HandlerA();
        IHandler handler2 = new HandlerB();
        IHandler handler3 = new HandlerC();

        // 注意链式的真正含义 什么叫锁链 每一个除了开头和结尾的链子扣外 其他所有的链扣前面牵一个后面拉一个 对于JAVA来说就是 handler1.next(handler2) handler2.next(handler3) 才能成为handler1<--->handler2<--->handler3的链扣
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.handleRequest(data);
    }
}
