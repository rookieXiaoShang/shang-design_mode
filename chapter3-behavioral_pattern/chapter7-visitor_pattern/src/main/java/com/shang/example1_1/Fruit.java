package com.shang.example1_1;

import java.time.LocalDate;

/**
 * @program: shang-design_mode
 * @description: 水果
 * @author: Shang
 * @create: 2024-11-03 15:16
 * @version: 1.0
 **/
public class Fruit extends IProduct{
    public Fruit(String name, LocalDate produce, Double price,float weight) {
        super(name, produce, price);
        this.weight = weight;
    }
    // 特有属性
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fruit{");
        sb.append("weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
