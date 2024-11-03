package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 具体迭代器
 * @author: Shang
 * @create: 2024-11-02 21:00
 * @version: 1.0
 **/
public class TopicIterator implements IteratorIterator<Topic>{

    //Topic数组
    private Topic[] topics;

    //记录存储位置
    private int position;

    public TopicIterator(Topic[] topics) {
        this.topics = topics;
        position = 0;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Topic next() {
        return topics[position++];
    }

    @Override
    public Topic currentItem() {
        return topics[position];
    }

    @Override
    public boolean hasNext() {
        if(position >= topics.length){
            return false;
        }
        return true;
    }
}
