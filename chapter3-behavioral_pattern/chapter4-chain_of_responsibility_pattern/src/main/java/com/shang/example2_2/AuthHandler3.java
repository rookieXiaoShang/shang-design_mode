package com.shang.example2_2;

import java.text.ParseException;
import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 三级处理者
 * @author: Shang
 * @create: 2024-11-02 16:13
 * @version: 1.0
 **/
public class AuthHandler3 extends IAuthHandler{
    // 传入十一前后的时间
    Date startDate = sdf.parse("2024-11-01 23:59:59");
    Date endDate = sdf.parse("2024-11-30 23:59:59");

    public AuthHandler3(String levelName, String levelId) throws ParseException {
        super(levelName, levelId);
    }

    @Override
    public AuthInfo doAuth(String orderName, String orderId, Date authDate) {
        // 是否审查
        Date date = AuthService.queryAuth(levelId, orderId);
        if(date == null){
            // 首先进入审查状态
            return new AuthInfo("100","等待被三级审查人",levelName,"进行审查！！！");
        }
        // 判断是否有next 加不加super实际上使用的都是父类的getNext方法
        IAuthHandler nextHandler = super.getNextHandler();
        if(nextHandler == null){
            return new AuthInfo("200",orderId,"三级审核完成！","审批人：",levelName,"审批时间：",sdf.format(authDate));
        }
        // 将符合后续判断要求的时间段传入 否则直接返回三级审查完成
        if(authDate.before(startDate) || authDate.after(endDate)){
             return new AuthInfo("200",orderId,"未临近双十一只能进行三级审核！","三级审核完成！","审批人：",levelName,"审批时间：",sdf.format(authDate));
        }
       return nextHandler.doAuth(orderName,orderId,authDate);
    }
}
