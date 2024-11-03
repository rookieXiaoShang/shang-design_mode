package com.shang.example1_1;

import java.text.NumberFormat;
import java.time.LocalDate;

/**
 * @program: shang-design_mode
 * @description: 具体访问者收银员
 * @author: Shang
 * @create: 2024-11-03 15:21
 * @version: 1.0
 **/
public class DiscountVisitor implements IVisitor{
    private LocalDate billDate;

    public DiscountVisitor(LocalDate billDate) {
        this.billDate = billDate;
        System.out.println("结算日期："+billDate);
    }

    @Override
    public void visit(Candy candy) {
        System.out.println("糖果: " + candy.getName());

        //获取产品生产天数
        long days = billDate.toEpochDay() - candy.getProduceDate().toEpochDay();

        if(days > 180){
            System.out.println("超过半年的糖果,请勿食用!");
        }else{
            double rate = 0.9;
            double discountPrice = candy.getPrice() * rate;
            System.out.println("糖果打折后的价格"+ NumberFormat.getCurrencyInstance().format(discountPrice));
        }
    }

    @Override
    public void visit(Wine wine) {
        System.out.println("酒类: " + wine.getName()+",无折扣价格!");
        System.out.println("原价: "+NumberFormat.getCurrencyInstance().format(wine.getPrice()));
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("水果: " + fruit.getName());
        //获取产品生产天数
        long days = billDate.toEpochDay() - fruit.getProduceDate().toEpochDay();

        double rate = 0;

        if(days > 7){
            System.out.println("超过七天的水果,请勿食用!");
        }else if(days > 3){
            rate = 0.5;
        }else{
            rate = 1;
        }

        double discountPrice = fruit.getPrice() * fruit.getWeight() * rate;
        System.out.println("水果价格: "+NumberFormat.getCurrencyInstance().format(discountPrice));
    }
}
