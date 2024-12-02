package com.shang.example1_1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 15:27
 * @version: 1.0
 **/
public class Client {
    /*
    将实体对象和计算方法之间进行解耦

    访问者具体成员：
    数据结构：也可以说是产品实体，就像该测试方法中的IProduct 由于是抽象类 又可以有多个实现类 如水果 糖果等等
    抽象元素接口（接待者）：维护accept方法接收一个IVisitor实现对象（关键中的关键）
    具体元素接口：就是一个数据结构实现了接待者接口的实体 实现accept方法（调用visitor中的重载方法传入this对象来明确调用计算逻辑）
    visitor接口（访问者）：有大量重载方法（传入不同的数据结构子类） 这些方法实现的功能目标一致 但是实现功能的过程不一致
    具体visitor：实现具体的计算业务逻辑

    符合的设计原则：
    接口分离好像擦点边，单一职责，开闭原则，依赖倒置原则 迪米特法则 里氏替换原则

    实现不同商品的价格计算
    出现了一个新问题 由于每一个Product的价格计算方式都不一致 那么当购买多个不同种类的产品时 该如何计算价格
    明天实现 老师家长校长学生之间的观察者
     */
    public static void main(String[] args) {
        //德芙巧克力,生产日期2002-5-1 ,原价 10元
        Candy candy = new Candy("德芙巧克力",LocalDate.of(2022,5,1),10.0);

        IVisitor visitor = new DiscountVisitor(LocalDate.of(2022,10,11));
        visitor.visit(candy);

        // 如何将一批产品的总价格
        List<IProduct> products = Arrays.asList(
                new Candy("金丝猴奶糖",LocalDate.of(2022,6,10),10.00),
                new Wine("衡水老白干",LocalDate.of(2020,6,10),100.00),
                new Fruit("草莓",LocalDate.of(2022,10,12),50.00,1)
        );

        // 遍历集合可行吗
        for (IProduct product : products) {
            // visitor中存在多个方法 但是是多个方法重载 只能靠参数多态IProduct 有Fruit等产品来区分具体的计算逻辑
            // 循环中所有产品都是IProduct 无法强转为实际的商品
        }

    }
}
