package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 15:32
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        // 对象是同一个对象 但是同一个对象的内部状态一致 外部状态却不一致
        ChessFlyweight chessFlyweight = ChessFlyweight.getChessFlyweight();
        IChess b2 = chessFlyweight.getChess("b");
        IChess b1 = chessFlyweight.getChess("b");
        System.out.println("判断两颗黑子是否为同一个对象"+(b2 == b1));

        IChess w2 = chessFlyweight.getChess("w");
        IChess w1 = chessFlyweight.getChess("w");
        System.out.println("判断两颗白子是否为同一个对象"+(w2 == w1));

        b2.display();
        b1.display();
        w2.display();
        w1.display();
    }
}
