package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 刷子实现类
 * @author: Shang
 * @create: 2024-10-30 21:46
 * @version: 1.0
 **/
public class BigBrush extends IBrush{
    public BigBrush(IDraw iDraw){
        super(iDraw);
    }
    @Override
    public void draw(){
        System.out.println("大刷子");
        iDraw.draw();
    }
}
