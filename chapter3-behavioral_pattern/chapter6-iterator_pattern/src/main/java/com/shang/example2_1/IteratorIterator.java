package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 抽象迭代器
 * @author: Shang
 * @create: 2024-11-02 20:58
 * @version: 1.0
 **/
public interface IteratorIterator<E>{
    void reset();   //重置为第一个元素
    E next();   //获取下一个元素
    E currentItem();    //检索当前元素
    boolean hasNext();  //判断是否还有下一个元素存在
}
