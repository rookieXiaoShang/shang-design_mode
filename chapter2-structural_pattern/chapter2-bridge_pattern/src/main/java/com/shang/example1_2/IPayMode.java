package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 支付安全验证
 * @author: Shang
 * @create: 2024-10-31 09:17
 * @version: 1.0
 **/
public interface IPayMode {
    boolean security(String uid);
}
