package com.shang.example1_1.factory;

import com.shang.example1_1.service.DeliverGoods;
import com.shang.example1_1.service.IFreeGoods;
import com.shang.example1_1.service.SendAQIYICard;
import com.shang.example1_1.service.SendDiscountCoupon;

/**
 * @program: shang-design_mode
 * @description: 简单工厂
 * @author: Shang
 * @create: 2024-10-29 10:48
 * @version: 1.0
 **/
public class FreeGoodsFactory {
    // 注意使用的是静态方法
    public static IFreeGoods getInstance(String type){
        if(type.equalsIgnoreCase("1")){
            return new SendAQIYICard();
        }else if(type.equalsIgnoreCase("2")){
            return new SendDiscountCoupon();
        }else if(type.equalsIgnoreCase("3")){
            return new DeliverGoods();
        }else {
            throw new RuntimeException("商品类型错误");
        }
    }
}
