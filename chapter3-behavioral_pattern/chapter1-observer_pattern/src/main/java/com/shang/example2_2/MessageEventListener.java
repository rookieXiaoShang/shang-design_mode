package com.shang.example2_2;

import com.shang.example2_1.LotteryResult;

/**
 * @program: shang-design_mode
 * @description: 观察者（监听者）实现短信发送中奖结果
 * @author: Shang
 * @create: 2024-10-31 20:32
 * @version: 1.0
 **/
public class MessageEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("发送短信通知用户ID为: " + result.getUid() + ",在" + result.getDate() +
                ",您的摇号结果如下: " + result.getMessage());
    }
}
