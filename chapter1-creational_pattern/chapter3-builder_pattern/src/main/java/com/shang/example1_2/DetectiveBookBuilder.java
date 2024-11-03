package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 侦探小说建造者
 * @author: Shang
 * @create: 2024-10-30 16:35
 * @version: 1.0
 **/
public class DetectiveBookBuilder implements IBuilder{
    @Override
    public void writeTitle() {
        BOOK.setTitle("神探夏洛克");
    }

    @Override
    public void writeAuthor() {
        BOOK.setAuthor("柯南道尔");
    }

    @Override
    public Book createBook() {
        return BOOK;
    }
}
