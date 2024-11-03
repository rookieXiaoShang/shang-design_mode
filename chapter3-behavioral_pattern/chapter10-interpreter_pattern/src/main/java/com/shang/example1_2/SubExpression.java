package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 减法表达式
 * @author: Shang
 * @create: 2024-11-03 17:48
 * @version: 1.0
 **/
public class SubExpression implements Expression{
    private Expression exp1;
    private Expression exp2;

    public SubExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
