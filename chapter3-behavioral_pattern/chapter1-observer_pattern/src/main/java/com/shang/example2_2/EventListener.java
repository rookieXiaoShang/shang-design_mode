package com.shang.example2_2;

import com.shang.example2_1.LotteryResult;

/**
 * @program: shang-design_mode
 * @description: 事件监听者（发送中奖消息）
 * @author: Shang
 * @create: 2024-10-31 20:29
 * @version: 1.0
 **/
public interface EventListener {
    // 要拿着抽奖结果做监听
    void doEvent(LotteryResult result);
}
