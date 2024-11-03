package com.shang.example1_2;

import java.math.BigDecimal;

/**
 * @program: shang-design_mode
 * @description: 微信支付
 * @author: Shang
 * @create: 2024-10-31 09:24
 * @version: 1.0
 **/
public class ZfbPay extends IPay{
    // 维护一个构造器接收桥接对象
    public ZfbPay(IPayMode iPayMode){
        super(iPayMode);
    }
    // 重写父类方法
    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {

        System.out.println("支付宝渠道支付划账开始......");

        boolean security = iPayMode.security(uid);
        System.out.println("支付宝渠道支付风险校验: " + uid + " , " + tradeId +" , " + security);

        if(!security){
            System.out.println("支付宝渠道支付划账失败!");
            return "500";
        }

        System.out.println("支付宝渠道划账成功! 金额: "+ amount);
        return "200";
    }
}
