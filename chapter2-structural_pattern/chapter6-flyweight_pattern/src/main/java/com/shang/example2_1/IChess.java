package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 抽象棋子
 * @author: Shang
 * @create: 2024-10-31 15:26
 * @version: 1.0
 **/
public abstract class IChess {
    abstract String getColor();
    public void display(){
        System.out.println("棋子的颜色："+getColor());
    }
}
