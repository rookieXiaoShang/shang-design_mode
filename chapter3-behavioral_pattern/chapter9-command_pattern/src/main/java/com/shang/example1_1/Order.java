package com.shang.example1_1;

import java.util.HashMap;

/**
 * @program: shang-design_mode
 * @description: 菜单类 与业务相关联的类
 * @author: Shang
 * @create: 2024-10-22 11:11
 * @version: 1.0
 **/
public class Order {
    // 餐桌编号
    private int orderId;
    // 菜品名称及数量集合
    private HashMap<String,Integer> foodMenu;

    public Order() {
    }

    public Order(int orderId, HashMap<String, Integer> foodMenu) {
        this.orderId = orderId;
        this.foodMenu = foodMenu;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public HashMap<String, Integer> getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(HashMap<String, Integer> foodMenu) {
        this.foodMenu = foodMenu;
    }
}
