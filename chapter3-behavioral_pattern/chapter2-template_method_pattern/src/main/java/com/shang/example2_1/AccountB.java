package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 子系统B
 * @author: Shang
 * @create: 2024-10-31 21:33
 * @version: 1.0
 **/
public class AccountB extends Account{
    // 设置利息
    @Override
    public void step3() {
        System.out.println("借款周期7天,无利息!仅收取贷款金额1%的服务费");
    }
}
