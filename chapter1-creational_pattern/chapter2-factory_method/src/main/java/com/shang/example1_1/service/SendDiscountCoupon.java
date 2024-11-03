package com.shang.example1_1.service;

import com.shang.example1_1.pojo.RequestAwardInfo;
import com.shang.example1_1.pojo.ResponseResult;

/**
 * @program: shang-design_mode
 * @description: 送打折卡
 * @author: Shang
 * @create: 2024-10-29 10:24
 * @version: 1.0
 **/
public class SendDiscountCoupon implements IFreeGoods{
    @Override
    public ResponseResult sendGoods(RequestAwardInfo awardInfo) {
        System.out.println("打折卡"+awardInfo.getSku()+"发送给用户："+awardInfo.getConsigneeUserName());
        return new ResponseResult("200","0.5打折卡发送成功");
    }
}
