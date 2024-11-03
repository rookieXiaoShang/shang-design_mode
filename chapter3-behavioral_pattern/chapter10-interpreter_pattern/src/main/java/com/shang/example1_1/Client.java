package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 17:36
 * @version: 1.0
 **/
public class Client {
    /*
    解释器模式的具体成员：
    抽象表达式（Abstract Expression）角色：约定解释方法 interpret()。
    终结符表达式（Terminal  Expression）角色：是抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应
    非终结符表达式（Nonterminal Expression）角色：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
    非终结符表达式（Nonterminal Expression）角色：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。

    比如`“ 9 5 7 3 - + * ”`这样一个表达式，
    我们按照上面的语法规则来处理，取出数字 `“9、5”` 和 `“-”` 运算符，计算得到 4，
    于是表达式就变成了`“ 4 7 3 + * ”`。然后，我们再取出`“4 7”`和“ + ”运算符，计算得到 11，
    表达式就变成了“ 11 3 * ”。最后，我们取出“ 11 3”和“ * ”运算符，最终得到的结果就是 33。
     */
    public static void main(String[] args) {
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        String expression = "9 5 7 3 - + *";
        long interpret = interpreter.interpret(expression);
        System.out.println(interpret);
    }
}
