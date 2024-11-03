package com.shang.example1_2;

/**
 * @program: shang-design_mode
 * @description: 微信支付的安全校验
 * @author: Shang
 * @create: 2024-10-31 09:19
 * @version: 1.0
 **/
public class PasswordPayMode implements IPayMode{
    @Override
    public boolean security(String uid) {
        System.out.println("密码安全校验");
        return true;
    }
}
