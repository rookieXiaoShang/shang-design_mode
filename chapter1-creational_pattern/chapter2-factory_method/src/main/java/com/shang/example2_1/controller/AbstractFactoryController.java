package com.shang.example2_1.controller;

import com.shang.example1_1.factory.FreeGoodsFactory;
import com.shang.example1_1.pojo.RequestAwardInfo;
import com.shang.example1_1.service.IFreeGoods;
import com.shang.example2_1.factory.FreeGoodsFactoryMap;
import com.shang.example2_1.factory.IFreeGoodsFactory;

/**
 * @program: shang-design_mode
 * @description: 调用业务的controller方法
 * @author: Shang
 * @create: 2024-10-29 11:47
 * @version: 1.0
 **/
public class AbstractFactoryController {
    public void sendGoods(RequestAwardInfo awardInfo, String type){
        IFreeGoodsFactory parserFactory = FreeGoodsFactoryMap.getParserFactory(Integer.valueOf(type));
        IFreeGoods freeGoods = parserFactory.createFreeGoods();
        freeGoods.sendGoods(awardInfo);
    }
}
