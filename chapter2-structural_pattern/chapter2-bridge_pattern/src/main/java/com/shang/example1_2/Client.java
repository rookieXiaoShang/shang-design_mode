package com.shang.example1_2;

import java.math.BigDecimal;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 09:28
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        IPay wx = new WxPay(new FacePayMode());
        wx.transfer("s128","hfiohfio", BigDecimal.valueOf(123));

        IPay wx1 = new WxPay(new PasswordPayMode());
        wx.transfer("s128","hfiohfio", BigDecimal.valueOf(123));

        IPay zfb = new ZfbPay(new FingerPayMode());
        zfb.transfer("s128","hfiohfio", BigDecimal.valueOf(123));
    }
}
