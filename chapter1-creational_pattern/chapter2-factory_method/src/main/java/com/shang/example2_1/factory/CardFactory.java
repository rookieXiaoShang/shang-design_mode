package com.shang.example2_1.factory;

import com.shang.example1_1.service.IFreeGoods;
import com.shang.example1_1.service.SendAQIYICard;

/**
 * @program: shang-design_mode
 * @description: 创建礼品卡工厂
 * @author: Shang
 * @create: 2024-10-29 11:39
 * @version: 1.0
 **/
public class CardFactory implements IFreeGoodsFactory{
    @Override
    public IFreeGoods createFreeGoods() {
        return new SendAQIYICard();
    }
}
