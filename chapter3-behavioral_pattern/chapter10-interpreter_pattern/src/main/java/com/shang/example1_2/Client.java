package com.shang.example1_2;


/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 17:50
 * @version: 1.0
 **/
public class Client {
    /*
    代码重构
     */
    public static void main(String[] args) {
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        String expression = "9 5 7 3 - + *";
        long interpret = interpreter.interpret(expression);
        System.out.println(interpret);
    }
}
