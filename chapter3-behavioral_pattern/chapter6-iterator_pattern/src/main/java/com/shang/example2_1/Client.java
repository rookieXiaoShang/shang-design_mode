package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-02 20:56
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        Topic[] topics = new Topic[4];
        topics[0] = new Topic("topic1");
        topics[1] = new Topic("topic2");
        topics[2] = new Topic("topic3");
        topics[3] = new Topic("topic4");

        TopicList topicList = new TopicList(topics);
        IteratorIterator<Topic> iterator = topicList.Iterator();

        while(iterator.hasNext()){
            Topic t = iterator.next();
            System.out.println(t.getName());
        }
    }
}