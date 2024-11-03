package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 策略A
 * @author: Shang
 * @create: 2024-11-01 10:14
 * @version: 1.0
 **/
public class StrategyB implements IStrategy{
    @Override
    public void doOperation() {
        System.out.println("执行策略B！！");
    }
}
