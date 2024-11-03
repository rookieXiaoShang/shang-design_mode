package com.shang.example1_1.controller;

import com.shang.example1_1.factory.FreeGoodsFactory;
import com.shang.example1_1.pojo.RequestAwardInfo;
import com.shang.example1_1.service.IFreeGoods;

/**
 * @program: shang-design_mode
 * @description: 发送逻辑
 * @author: Shang
 * @create: 2024-10-29 11:00
 * @version: 1.0
 **/
public class FreeGoodsController {
    public void sendGoods(RequestAwardInfo awardInfo, String type){

        IFreeGoods iFreeGoods = FreeGoodsFactory.getInstance(type);
        iFreeGoods.sendGoods(awardInfo);
    }
}
