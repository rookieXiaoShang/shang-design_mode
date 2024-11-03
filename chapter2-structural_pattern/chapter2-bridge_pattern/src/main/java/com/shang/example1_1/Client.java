package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-30 21:48
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        IBrush brush = new BigBrush(new DrawRed());
        brush.draw();

        IBrush brush1 = new BigBrush(new DrawBlue());
        brush1.draw();

        IBrush brush2 = new MediumBrush(new DrawGreen());
        brush2.draw();
    }
}
