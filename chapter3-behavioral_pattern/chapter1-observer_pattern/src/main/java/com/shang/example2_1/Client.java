package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 20:27
 * @version: 1.0
 **/
public class Client {
    /*
    来实现一个买房摇号的程序.摇号结束,需要通过短信告知用户摇号结果,还需要想MQ中保存用户本次摇号的信息
     */
    public static void main(String[] args) {
        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        LotteryResult lottery = lotteryService.lottery("2115146");

        // 打印摇号结果
        System.out.println(lottery);
    }
}
