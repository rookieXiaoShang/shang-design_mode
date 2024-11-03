package com.shang.example1_2;
import java.time.LocalDate;

/**
 * @program: shang-design_mode
 * @description: 抽象商品父类 是一种数据结构 又因为是一个抽象类 他可以衍生非常多的子类
 * @author: Shang
 * @create: 2024-11-03 14:58
 * @version: 1.0
 **/
public abstract class IProduct {
    private String name;
    private LocalDate produceDate;
    private Double price;

    public IProduct(String name, LocalDate produceDate, Double price) {
        this.name = name;
        this.produceDate = produceDate;
        this.price = price;
    }

    public IProduct() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(LocalDate produceDate) {
        this.produceDate = produceDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IProduct{");
        sb.append("name='").append(name).append('\'');
        sb.append(", produce=").append(produceDate);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
