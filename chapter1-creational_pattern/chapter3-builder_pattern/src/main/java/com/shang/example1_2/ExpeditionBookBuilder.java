package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 探险小说
 * @author: Shang
 * @create: 2024-10-30 16:40
 * @version: 1.0
 **/
public class ExpeditionBookBuilder implements IBuilder{
    @Override
    public void writeTitle() {
        BOOK.setTitle("鲁宾逊漂流记");
    }

    @Override
    public void writeAuthor() {
        BOOK.setAuthor("笛福");
    }

    @Override
    public Book createBook() {
        return BOOK;
    }
}
