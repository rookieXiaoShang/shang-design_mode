package com.shang.example1_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 享原工厂
 * @author: Shang
 * @create: 2024-10-31 15:16
 * @version: 1.0
 **/
public class FlyweightFactory {
    // 维护一个享原池
    Map<String,Flyweight> flyweights = new HashMap<>();
    // 享原池在使用的时候加载初始化 否则太占用内存了
    public FlyweightFactory(){
        flyweights.put("A",new ConcreteFlyweight("A"));
        flyweights.put("B",new ConcreteFlyweight("B"));
        flyweights.put("C",new ConcreteFlyweight("C"));
    }
    // 获取相关享原
    public Flyweight getFlyweight(String type){
        // 存在直接获取
        if(flyweights.containsKey(type)){
            System.out.println("===享元池中存在,直接复用,key:" + type);
            return flyweights.get(type);
        }else{
            // 不存在加入之后再获取
            System.out.println("===享元池中不存在,创建并复用,key:" + type);
            flyweights.put(type,new ConcreteFlyweight(type));
            return flyweights.get(type);
        }
    }
}
