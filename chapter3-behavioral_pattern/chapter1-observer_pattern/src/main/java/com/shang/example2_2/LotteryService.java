package com.shang.example2_2;

import com.shang.example2_1.LotteryResult;

/**
 * @program: shang-design_mode
 * @description: 开奖服务
 * @author: Shang
 * @create: 2024-10-31 20:47
 * @version: 1.0
 **/
public abstract class LotteryService {
    // 维护监听器管理者
    private EventManager eventManager = new EventManager();
    public LotteryService(){
        //设置事件类型
        eventManager = new EventManager(EventManager.ListenerType.MQ, EventManager.ListenerType.Message);
        //订阅
        eventManager.subscribe(EventManager.ListenerType.Message,new MessageEventListener());
        eventManager.subscribe(EventManager.ListenerType.MQ,new MQEventListener());
    }

    public LotteryResult lotteryAndMsg(String uId){
        // 要在子类中实现该方法
        LotteryResult result = lottery(uId);
        // 发送通知 也是调用监听者的过程
        eventManager.notifyResult(EventManager.ListenerType.Message,result);
        eventManager.notifyResult(EventManager.ListenerType.MQ,result);

        return result;
    }

    // 具体的开奖业务在子类中实现
    public abstract LotteryResult lottery(String uId);
}
