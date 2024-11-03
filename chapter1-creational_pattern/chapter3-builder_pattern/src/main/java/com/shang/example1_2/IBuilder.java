package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 抽象建造者
 * @author: Shang
 * @create: 2024-10-30 16:27
 * @version: 1.0
 **/
public interface IBuilder {
    // 维护一个具体产品 默认是public static final final只保证了地址是唯一的 实例对象的状态是可以改变的
    Book BOOK = new Book(); // 常量也表示建造者的对象创建是唯一的
    void writeTitle();
    void writeAuthor();
    Book createBook();
}
