package com.shang.example2_1;

import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 开奖实现类
 * @author: Shang
 * @create: 2024-10-31 20:25
 * @version: 1.0
 **/
public class LotteryServiceImpl implements LotteryService{
    // 注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();


    @Override
    public LotteryResult lottery(String uId) {
        //摇号
        String result = houseService.lots(uId);

        //发短信
        System.out.println("发送短信通知用户ID为: " + uId + ",您的摇号结果如下: " + result);

        //发送MQ消息
        System.out.println("记录用户摇号结果(MQ), 用户ID:" +  uId + ",摇号结果:" + result);

        return new LotteryResult(uId,result,new Date());
    }
}
