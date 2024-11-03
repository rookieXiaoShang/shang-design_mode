package com.shang.example2_1.factory;

import com.shang.example1_1.service.IFreeGoods;

/**
 * @program: shang-design_mode
 * @description: 抽象工厂接口
 * @author: Shang
 * @create: 2024-10-29 11:37
 * @version: 1.0
 **/
public interface IFreeGoodsFactory {
    public IFreeGoods createFreeGoods();
}
