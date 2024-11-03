package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 具体的观察者
 * @author: Shang
 * @create: 2024-10-31 17:44
 * @version: 1.0
 **/
public class ConcreteObserverA implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserverA update");
    }
}
