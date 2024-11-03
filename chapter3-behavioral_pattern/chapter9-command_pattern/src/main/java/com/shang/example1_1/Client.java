package com.shang.example1_1;

import java.util.HashMap;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 17:04
 * @version: 1.0
 **/
public class Client {
    /*
    命令模式的具体成员：
    抽象命令接口：维护一个execute方法来执行命令
    具体命令接口：引用命令的真正执行者也就是厨师，同时引用执行门类的相关业务类 实现execute的具体方法
    执行者类：真正的牛马 也就是打工人
    调用者：虚假的的牛马，也就是waiter，接收来自客人的要求 拥有一个指令集合存储要求（也就是命令） 引用一个执行者，命令执行者去干活

    符合的设计模式：
    开闭原则，单一职责，依赖倒置原则，里氏替换原则，迪米特法则
    不符合：
    接口分离原则

    实现餐馆上菜流程
     */
    public static void main(String[] args) {
        // 创建菜单
        Order order = new Order();
        order.setOrderId(12);
        HashMap<String,Integer> foodMenu1 = new HashMap<>();
        foodMenu1.put("牛肉面",3);
        foodMenu1.put("麻辣烫",2);
        foodMenu1.put("青椒肉丝",4);
        order.setFoodMenu(foodMenu1);

        // 创建菜单
        Order order1 = new Order();
        order1.setOrderId(2);
        HashMap<String,Integer> foodMenu2 = new HashMap<>();
        foodMenu2.put("牛肉面",3);
        foodMenu2.put("麻辣烫",2);
        foodMenu2.put("青椒肉丝",4);
        order1.setFoodMenu(foodMenu2);

        // 创建厨师
        Chef chef = new Chef();

        // 创建命令
        ICommand command = new CommandA(chef,order);
        ICommand command1 = new CommandA(chef,order1);

        // 设置命令
        Waiter waiter = new Waiter();
        waiter.setCommands(command);
        waiter.setCommands(command1);

        // 调用命令
        waiter.orderUp();
    }
}
