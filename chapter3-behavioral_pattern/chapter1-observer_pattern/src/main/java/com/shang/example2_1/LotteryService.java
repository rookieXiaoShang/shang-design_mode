package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 开奖服务
 * @author: Shang
 * @create: 2024-10-31 20:24
 * @version: 1.0
 **/
public interface LotteryService {
    //摇号相关业务
    LotteryResult lottery(String uId);
}
