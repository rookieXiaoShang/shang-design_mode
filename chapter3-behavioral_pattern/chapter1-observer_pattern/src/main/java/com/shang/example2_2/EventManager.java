package com.shang.example2_2;

import com.shang.example2_1.LotteryResult;

import java.util.*;
/**
 * @program: shang-design_mode
 * @description: 观察者管理
 * @author: Shang
 * @create: 2024-10-31 20:34
 * @version: 1.0
 **/
public class EventManager {
    // 使用枚举来定义监听者类型
    enum ListenerType{
        MQ,Message
    }
    // 维护一个map集合来管理所有的监听者
    Map<Enum<ListenerType>, List<EventListener>> listeners = new HashMap<Enum<ListenerType>, List<EventListener>>();
    // 构造器传入所有的监听者类型 同时初始化ArrayList集合
    public EventManager(Enum<ListenerType> ...listenerTypes) {
        for(Enum<ListenerType> listenerType : listenerTypes){
            listeners.put(listenerType, new ArrayList<EventListener>());
        }
    }
    // 订阅监听器
    public void subscribe(Enum<ListenerType> listenerType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(listenerType);
        eventListeners.add(listener);
    }
    // 取消监听器
    public void unsubscribe(Enum<ListenerType> listenerType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(listenerType);
        eventListeners.remove(listener);
    }
    // 实现通知
    public void notifyResult(Enum<ListenerType> eventType, LotteryResult result){
        List<EventListener> eventListeners = listeners.get(eventType);
        for(EventListener eventListener : eventListeners){
            eventListener.doEvent(result);
        }
    }
}
