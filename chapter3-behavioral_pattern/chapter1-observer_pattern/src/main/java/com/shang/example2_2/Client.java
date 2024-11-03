package com.shang.example2_2;


import com.shang.example2_1.LotteryResult;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 20:55
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        LotteryResult lotteryResult = lotteryService.lotteryAndMsg("2115146");

        System.out.println("打印摇号结果："+lotteryResult);
    }
}
