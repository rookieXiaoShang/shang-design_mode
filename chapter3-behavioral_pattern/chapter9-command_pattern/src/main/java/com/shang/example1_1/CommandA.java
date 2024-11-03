package com.shang.example1_1;

import java.util.Set;

/**
 * @program: shang-design_mode
 * @description: 命令实现类 具体的命令
 * @author: Shang
 * @create: 2024-10-22 11:18
 * @version: 1.0
 **/
public class CommandA implements ICommand{
    // 维护一个命令的具体执行者和完成命令所需要的相关类
    private Chef chef;
    private Order order;

    public CommandA(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getOrderId() + "桌的订单: ");
        Set<String> strings = order.getFoodMenu().keySet();
        for (String foodMenu : strings) {
            chef.cookFood(order.getFoodMenu().get(foodMenu),foodMenu);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(order.getFoodMenu() + "桌的菜已上齐.");
    }
}
