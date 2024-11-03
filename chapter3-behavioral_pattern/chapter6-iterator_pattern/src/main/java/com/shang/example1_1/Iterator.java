package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 迭代器接口
 * @author: Shang
 * @create: 2024-11-02 20:54
 * @version: 1.0
 **/
public interface Iterator<E>{
    //判断集合中是否有下一个元素
    boolean hasNext();

    //将游标后移一位元素
    void next();

    //返回当前游标指定的元素
    E currentItem();
}
