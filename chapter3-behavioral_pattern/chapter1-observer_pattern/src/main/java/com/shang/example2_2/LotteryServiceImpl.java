package com.shang.example2_2;

import com.shang.example2_1.DrawHouseService;
import com.shang.example2_1.LotteryResult;

import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 开奖的具体实现类
 * @author: Shang
 * @create: 2024-10-31 20:51
 * @version: 1.0
 **/
public class LotteryServiceImpl extends LotteryService{
    // 维护一个摇号类
    private DrawHouseService houseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        System.out.println("开始摇号");
        // 开始摇号
        String message = houseService.lots(uId);
        return new LotteryResult(uId,message,new Date());
    }
}
