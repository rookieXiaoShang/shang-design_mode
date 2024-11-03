package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 子系统A
 * @author: Shang
 * @create: 2024-10-31 21:33
 * @version: 1.0
 **/
public class AccountA extends Account{
    // 设置利息
    @Override
    public void step3() {
        System.out.println("借款周期30天,利率为10%!");
    }
}
