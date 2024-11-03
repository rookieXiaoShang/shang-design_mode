package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 刷子实现类
 * @author: Shang
 * @create: 2024-10-30 21:45
 * @version: 1.0
 **/
public class SmallBrush extends IBrush{
    public SmallBrush(IDraw iDraw) {
        super(iDraw);
    }
    @Override
    public void draw(){
        System.out.println("小刷子");
        iDraw.draw();
    }
}
