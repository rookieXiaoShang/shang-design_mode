package com.shang.example1_1.service;

import com.shang.example1_1.pojo.RequestAwardInfo;
import com.shang.example1_1.pojo.ResponseResult;

/**
 * @program: shang-design_mode
 * @description: 运送实体货物
 * @author: Shang
 * @create: 2024-10-29 10:25
 * @version: 1.0
 **/
public class DeliverGoods implements IFreeGoods{
    @Override
    public ResponseResult sendGoods(RequestAwardInfo awardInfo) {
        System.out.println("模拟发货实物商品一个：" + awardInfo);
        return new ResponseResult("200","实体商品发送成功！！！");
    }
}
