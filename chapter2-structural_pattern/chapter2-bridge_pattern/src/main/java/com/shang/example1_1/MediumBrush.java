package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 正常刷子
 * @author: Shang
 * @create: 2024-10-30 21:47
 * @version: 1.0
 **/
public class MediumBrush extends IBrush{
    public MediumBrush(IDraw iDraw) {
        super(iDraw);
    }
    @Override
    public void draw(){
        System.out.println("正常刷子");
        iDraw.draw();
    }
}
