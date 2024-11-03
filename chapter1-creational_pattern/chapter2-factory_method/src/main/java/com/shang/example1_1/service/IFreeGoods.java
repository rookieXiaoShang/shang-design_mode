package com.shang.example1_1.service;

import com.shang.example1_1.pojo.RequestAwardInfo;
import com.shang.example1_1.pojo.ResponseResult;

/**
 * @program: shang-design_mode
 * @description: 商品运送接口
 * @author: Shang
 * @create: 2024-10-29 10:15
 * @version: 1.0
 **/
public interface IFreeGoods {
    public ResponseResult sendGoods(RequestAwardInfo awardInfo);
}
