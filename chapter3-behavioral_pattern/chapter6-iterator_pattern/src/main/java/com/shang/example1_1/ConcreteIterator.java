package com.shang.example1_1;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @program: shang-design_mode
 * @description: 具体迭代器
 * @author: Shang
 * @create: 2024-11-02 20:55
 * @version: 1.0
 **/
public class ConcreteIterator<E> implements Iterator<E>{
    private int cursor; //游标

    private ArrayList<E> arrayList; //容器

    public ConcreteIterator(ArrayList<E> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if(cursor >= arrayList.size()){
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}