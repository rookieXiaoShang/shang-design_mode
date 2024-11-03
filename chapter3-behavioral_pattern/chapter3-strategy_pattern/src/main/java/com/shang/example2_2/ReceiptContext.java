package com.shang.example2_2;


/**
 * @program: shang-design_mode
 * @description: 上下文是用来设置策略 调用策略
 * @author: Shang
 * @create: 2024-11-01 10:53
 * @version: 1.0
 **/
public class ReceiptContext {
    private IReceiptStrategy strategy = null;
    public ReceiptContext(IReceiptStrategy strategy) {
        this.strategy = strategy;
    }
    // 策略方法
    public void executeStrategy(Receipt receipt) {
        // 设置代码健壮性
        if(receipt != null) {
            strategy.receiver(receipt);
        }
    }
}
