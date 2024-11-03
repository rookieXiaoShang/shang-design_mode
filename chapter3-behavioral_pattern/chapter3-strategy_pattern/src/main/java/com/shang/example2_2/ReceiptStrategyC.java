package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 回执策略A
 * @author: Shang
 * @create: 2024-11-01 10:49
 * @version: 1.0
 **/
public class ReceiptStrategyC implements IReceiptStrategy{
    @Override
    public void receiver(Receipt receipt) {
        System.out.println("解析回执内容：" + receipt.getMessage());
        System.out.println("实现业务C逻辑");
    }
}
