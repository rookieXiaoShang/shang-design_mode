package com.shang.example2_1.factory;

import com.shang.example1_1.service.DeliverGoods;
import com.shang.example1_1.service.IFreeGoods;

/**
 * @program: shang-design_mode
 * @description: 实体商品工厂
 * @author: Shang
 * @create: 2024-10-29 11:41
 * @version: 1.0
 **/
public class GoodFactory implements IFreeGoodsFactory{
    @Override
    public IFreeGoods createFreeGoods() {
        return new DeliverGoods();
    }
}
