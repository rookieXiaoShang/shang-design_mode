package com.shang.example2_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: shang-design_mode
 * @description: 抽奖备忘录
 * @author: Shang
 * @create: 2024-10-23 20:26
 * @version: 1.0
 **/
public class Memento {
    // 初始金币
    private Integer money;
    // 水果集合 集合会存在线程安全的问题抛出异常ConcurrentModificationException 使用线程安全的集合替代
    private CopyOnWriteArrayList<String> fruits = new CopyOnWriteArrayList<>();

    public Memento(Integer money) {
        this.money = money;
    }

    // 添加水果
    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    // 获取水果集合
    public List<String> getFruits(){
        // 要返回的是一个备忘录的副本 否则后续对player中的fruits修改也会影响到memento中的fruits
        return (List)fruits.clone();
    }

    // 获取金币
    public Integer getMoney() {
        return money;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Memento{");
        sb.append("money=").append(money);
        sb.append(", fruits=").append(fruits);
        sb.append('}');
        return sb.toString();
    }
}
