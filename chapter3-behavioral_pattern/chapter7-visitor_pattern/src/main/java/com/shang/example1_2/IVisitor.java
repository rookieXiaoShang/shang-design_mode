package com.shang.example1_2;


/**
 * @program: shang-design_mode
 * @description: 抽象访问者（相当于一个收银员）
 * @author: Shang
 * @create: 2024-11-03 15:20
 * @version: 1.0
 **/
public interface IVisitor {
    // 使用的就是方法重载 不能使用多态 每一类的产品实现的计算方式都不一样 靠传入不同的参数在实现类中调用不同的计算方法
    void visit(CandyA candy);
    void visit(WineA wine);
    void visit(FruitA fruit);
}
