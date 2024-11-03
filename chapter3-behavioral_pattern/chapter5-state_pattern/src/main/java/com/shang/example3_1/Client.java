package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 10:42
 * @version: 1.0
 **/
public class Client {
    /*
    测试状态模式： 水，冰，水蒸气之间的转换
     */
    public static void main(String[] args) {
        TemperatureContext context = new TemperatureContext();
        System.out.println(context);
        context.toAir();
        System.out.println(context.getState());
    }
}
