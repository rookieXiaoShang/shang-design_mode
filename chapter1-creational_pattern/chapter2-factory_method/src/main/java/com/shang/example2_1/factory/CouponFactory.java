package com.shang.example2_1.factory;

import com.shang.example1_1.service.IFreeGoods;
import com.shang.example1_1.service.SendDiscountCoupon;

/**
 * @program: shang-design_mode
 * @description: 打折卡工厂
 * @author: Shang
 * @create: 2024-10-29 11:40
 * @version: 1.0
 **/
public class CouponFactory implements IFreeGoodsFactory{
    @Override
    public IFreeGoods createFreeGoods() {
        return new SendDiscountCoupon();
    }
}
