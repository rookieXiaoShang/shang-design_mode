package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 比亚迪生产的车
 * @author: Shang
 * @create: 2024-10-30 16:04
 * @version: 1.0
 **/
public class BYaDiCar implements ICar{
    @Override
    public void run() {
        System.out.println("开上了比亚迪的电动车");
    }
}
