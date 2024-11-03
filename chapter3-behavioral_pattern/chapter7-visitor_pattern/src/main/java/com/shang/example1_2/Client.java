package com.shang.example1_2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 15:46
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        List<Acceptable> products = Arrays.asList(
                new CandyA("金丝猴奶糖",LocalDate.of(2022,6,10),10.00),
                new WineA("衡水老白干",LocalDate.of(2020,6,10),100.00),
                new FruitA("草莓",LocalDate.of(2022,10,12),50.00,1)
        );
        IVisitor visitor = new DiscountVisitor(LocalDate.of(2022,10,17));
        for (Acceptable product : products) {
            product.accept(visitor);
        }
    }
}
