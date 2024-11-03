package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 刷子接口
 * @author: Shang
 * @create: 2024-10-30 21:42
 * @version: 1.0
 **/
public abstract class IBrush {
    protected IDraw iDraw;
    IBrush(IDraw iDraw) {
        this.iDraw = iDraw;
    }
    abstract void draw();
}
