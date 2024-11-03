package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 书本写作指挥者
 * @author: Shang
 * @create: 2024-10-30 16:31
 * @version: 1.0
 **/
public class BookDirector {
    // 指挥者需要维护一个建造者 使用建造者对象来进行产品生产与组装
    private IBuilder builder;
    public BookDirector(IBuilder builder){
        this.builder = builder;
    }
    // 指挥方法
    public Book constructBook(){
        builder.writeAuthor();
        builder.writeTitle();
        Book book = builder.createBook();
        return book;
    }
}
