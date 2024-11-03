package com.shang.example1_2;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: shang-design_mode
 * @description: 解释器
 * @author: Shang
 * @create: 2024-11-03 17:35
 * @version: 1.0
 **/
public class ExpressionInterpreter {

    //Deque双向队列，可以从队列的两端增加或者删除元素
    private Deque<Expression> numbers = new LinkedList<>();


    //接收表达式进行解析
    public long interpret(String expression){

        String[] elements = expression.split(" ");

        int length = elements.length;

        //获取表达式中的数字
        for (int i = 0; i < (length+1)/2; ++i) {
            //在 Deque的尾部添加元素 会出现空字符串问题
            if (!elements[i].isEmpty()){
                numbers.addLast(new NumExpression(elements[i]));
            }
        }

        //获取表达式中的符号
        for (int i = (length+1)/2; i < length; ++i) {
            String operator = elements[i];
            //符号必须是 + - * / 否则抛出异常
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }

            //pollFirst()方法, 移除Deque中的第一个元素,并返回被移除的值
            Expression number1 = numbers.pollFirst(); //数字
            Expression number2 = numbers.pollFirst();

            Expression result = null;  //运算结果

            //对number1和number2进行运算
            if (operator.equals("+")) {
                result = new PluExpression(number1, number2);
            } else if (operator.equals("-")) {
                result = new SubExpression(number1, number2);
            } else if (operator.equals("*")) {
                result = new MulExpression(number1, number2);
            } else if (operator.equals("/")) {
                result = new DivExpression(number1, number2);
            }

            //将运算结果添加到集合头部
            numbers.addFirst(result);
        }

        //运算完成numbers中应该保存着运算结果,否则是无效表达式
        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }
        //移除Deque的第一个元素,并返回
        return numbers.pop().interpret();
    }
}
