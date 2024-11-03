package com.shang.example1_2;

import java.math.BigDecimal;

/**
 * @program: shang-design_mode
 * @description: 支付接口
 * @author: Shang
 * @create: 2024-10-30 22:09
 * @version: 1.0
 **/
public abstract class IPay {
    // 维护一个桥接行为
    protected final IPayMode iPayMode;

    protected IPay(IPayMode iPayMode) {
        this.iPayMode = iPayMode;
    }
    // 实现一个划账行为
    public abstract String transfer(String uid,String tradeId, BigDecimal amount);
}
