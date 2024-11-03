package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象访问者（相当于一个收银员）
 * @author: Shang
 * @create: 2024-11-03 15:20
 * @version: 1.0
 **/
public interface IVisitor {
    void visit(Candy candy);
    void visit(Wine wine);
    void visit(Fruit fruit);
}
