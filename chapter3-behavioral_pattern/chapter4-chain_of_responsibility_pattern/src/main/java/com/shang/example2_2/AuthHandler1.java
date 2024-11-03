package com.shang.example2_2;

import java.text.ParseException;
import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 一级处理者
 * @author: Shang
 * @create: 2024-11-02 16:13
 * @version: 1.0
 **/
public class AuthHandler1 extends IAuthHandler{
    // 传入十一前后的时间
    public AuthHandler1(String levelName, String levelId) throws ParseException {
        super(levelName, levelId);
    }

    @Override
    public AuthInfo doAuth(String orderName, String orderId, Date authDate) {
        // 是否审查
        Date date = AuthService.queryAuth(levelId, orderId);
        if(null == date){
            // 首先进入审查状态
            return new AuthInfo("100","等待被一级审查人"+levelName+"进行审查！！！");
        }
        // 判断是否有next 加不加super实际上使用的都是父类的getNext方法
        IAuthHandler nextHandler = getNextHandler();
        if(null == nextHandler){
            return new AuthInfo("200","状态："+orderId+"一级审核完成！"+"审批人："+levelName+"审批时间："+authDate);
        }
        return nextHandler.doAuth(orderName,orderId,authDate);
    }
}
