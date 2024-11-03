package com.shang.example2_2;



/**
 * @program: shang-design_mode
 * @description: 回执策略的抽象接口
 * @author: Shang
 * @create: 2024-11-01 10:48
 * @version: 1.0
 **/
public interface IReceiptStrategy {
    void receiver(Receipt receipt);
}
