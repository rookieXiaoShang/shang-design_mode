package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 厨师类 具体的业务执行类
 * @author: Shang
 * @create: 2024-10-22 11:13
 * @version: 1.0
 **/
public class Chef {
    // 做饭 只能说打工人不配有名字 牛马
    public void cookFood(int num, String name){
        System.out.println(num + "份," + name);
    }
}
