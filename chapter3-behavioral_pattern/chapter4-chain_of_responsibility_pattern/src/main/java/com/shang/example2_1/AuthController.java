package com.shang.example2_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 具体的审查流程
 * @author: Shang
 * @create: 2024-11-01 20:57
 * @version: 1.0
 **/
public class AuthController {
    /* 双十一前(11.01 - 11.10)需要二级(11.11 - 11.20)一级审核人参与审批)    一级审查人uid 1001 二级1002 三级1003*/

    /**
     * 审查流程
     * @param name 开发人员姓名
     * @param orderId 业务id
     * @param authdate 要审查的日期
     * @return
     * @throws ParseException
     */
    // 具体审查流程
    public AuthInfo authInfo(String name, String orderId, Date authdate) throws ParseException {
        // 设置时间格式
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 首先判断该信息是否已经被三级审查 在任何时间段都会进行三级审查判断
        Date date = AuthService.queryAuth("1003", orderId);
        // 未被审查 开始等待三级审查人审查
        if(date == null){
            return new AuthInfo("100", "订单编号：" + orderId + "正在等待三级审核人进行审批");
        }
        // 设置时间格式
        if(authdate.after(f.parse("2024-11-01 00:00:00")) && authdate.before(f.parse("2024-11-30 00:00:00"))){
            // 查看二级审核人是否审批
            date = AuthService.queryAuth("1002", orderId);
            if(date == null){ // 正在等待二级审查人审查
                return new AuthInfo("100","订单编号：" + orderId + "正在等待二级审核人进行审批");
            }
        }
        if(authdate.after(f.parse("2024-11-11 00:00:00")) && authdate.before(f.parse("2024-11-30 00:00:00"))){
            // 查看一级审核人是否审批
            date = AuthService.queryAuth("1001", orderId);
            if(date == null){ // 正在等待一级级审查人审查
                return new AuthInfo("100","订单编号：" + orderId + "正在等待一级审核人进行审批");
            }
        }
        return new AuthInfo("200","研发人："+ name +"业务编号：" + orderId + "已被审查员审查完成！！！");
    }
}
