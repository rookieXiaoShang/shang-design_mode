package com.shang.example1_1.service;

import com.shang.example1_1.pojo.RequestAwardInfo;
import com.shang.example1_1.pojo.ResponseResult;

/**
 * @program: shang-design_mode
 * @description: 发送礼品卡
 * @author: Shang
 * @create: 2024-10-29 10:22
 * @version: 1.0
 **/
public class SendAQIYICard implements IFreeGoods{
    @Override
    public ResponseResult sendGoods(RequestAwardInfo awardInfo) {
        System.out.println("爱奇艺视频卡"+awardInfo.getSku()+"发送给用户："+awardInfo.getConsigneeUserName());
        return new ResponseResult("200","爱奇艺礼品卡发送成功");
    }
}
