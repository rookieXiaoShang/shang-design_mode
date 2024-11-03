package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象观察者管理类 这只是一个维护观察者的类
 * @author: Shang
 * @create: 2024-10-31 17:44
 * @version: 1.0
 **/
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
