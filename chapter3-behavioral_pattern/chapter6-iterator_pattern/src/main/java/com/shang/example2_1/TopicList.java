package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 具体的集合类
 * @author: Shang
 * @create: 2024-11-02 21:01
 * @version: 1.0
 **/
public class TopicList implements ListList<Topic>{
    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    // 返回的是一个迭代器实例
    @Override
    public IteratorIterator<Topic> Iterator() {
        return new TopicIterator(topics);
    }
}
