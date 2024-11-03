package com.shang.example1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 具体观察者管理类
 * @author: Shang
 * @create: 2024-10-31 17:47
 * @version: 1.0
 **/
public class ConcreteSubject implements Subject{
    // 维护一个观察者集合
    private List<Observer> observers = new ArrayList<Observer>();

    // 增加一个观察者
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
    // 删除一个观察者
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 使用所有观察者
    @Override
    public void notifyObservers() {
        System.out.println("被观察者调用观察者方法！！！");
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
