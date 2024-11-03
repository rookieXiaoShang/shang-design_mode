package com.shang.example1_2;
/**
 * @program: shang-design_mode
 * @description: 测试普通建造者方法
 * @author: Shang
 * @create: 2024-10-30 16:44
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        BookDirector director = new BookDirector(new ExpeditionBookBuilder());
        Book book = director.constructBook();
        System.out.println(book);
    }
}