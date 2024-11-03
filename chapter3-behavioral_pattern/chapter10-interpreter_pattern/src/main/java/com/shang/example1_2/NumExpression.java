package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 数字表达式
 * @author: Shang
 * @create: 2024-11-03 17:47
 * @version: 1.0
 **/
public class NumExpression implements Expression{
    private long number;

    public NumExpression(long number) {
        this.number = number;
    }

    public NumExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
