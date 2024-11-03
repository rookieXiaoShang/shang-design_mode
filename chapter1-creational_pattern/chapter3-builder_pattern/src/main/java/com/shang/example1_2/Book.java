package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 建造者的最终产品
 * @author: Shang
 * @create: 2024-10-30 16:27
 * @version: 1.0
 **/
public class Book {
    private String title;
    private String author;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
