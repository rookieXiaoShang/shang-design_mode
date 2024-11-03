package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 维护和使用策略的上下文类
 * @author: Shang
 * @create: 2024-11-01 10:16
 * @version: 1.0
 **/
public class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    // 调用策略类方法
    public void doOperator(){
        strategy.doOperation();
    }
}
