package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 负责人类
 * @author: Shang
 * @create: 2024-10-23 19:56
 * @version: 1.0
 **/
public class Caretaker {
    // 维护一个备忘录对象
    private Memento memento;
    // 查看Memento对象
    public Memento getMemento() {
        return memento;
    }
    // 保存Memento对象
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
