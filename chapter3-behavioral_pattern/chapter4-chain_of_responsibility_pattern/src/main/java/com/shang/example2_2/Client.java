package com.shang.example2_2;

import com.alibaba.fastjson.JSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-02 16:01
 * @version: 1.0
 **/
public class Client {
    /*
    模拟有一个双11期间,业务系统审批的流程,临近双十一公司会有陆续有一些新的需求上线,为了保证线上系统的稳定,
    对上线的审批流畅做了严格的控制.审批的过程会有不同级别的负责人加入进行审批
    平常系统上线只需三级负责人审批即可,
    双十一临近(11.01 - 11.20和11.26 - 11.30)需要三级和二级同时审批
    正在双十一(11.11 - 11.25)一级审核人参与审批 三级和二级也要参与审批
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2024-11-03 00:00:00"); // 校验时间
        String orderName = "打工人"; // 设置业务开发者
        String orderId = "s123456"; // 商品编号

        // 设置处理者 注意链式的真正含义 handler1要设置handler2作为next handler2要设置handler1作为next
        AuthHandler3 handler = new AuthHandler3("开发者小尚","1003");
        AuthHandler2 authHandler2 = new AuthHandler2("王经理","1002");
        AuthHandler1 authHandler1 = new AuthHandler1("周老板","1001");
        // 设置链式关系 两种设置链式关系
        handler.appendNext(authHandler2);
        authHandler2.appendNext(authHandler1);


/*        IAuthHandler handler = new AuthHandler3("开发者小尚","1003")
                .appendNext(new AuthHandler2("王经理","1002")
                        .appendNext(new AuthHandler1("周老板","1001")));
*/

        // 开始审查
        handler.logger.info("初始状态："+ JSON.toJSONString(handler.doAuth(orderName,orderId,parse)));

        // 模拟三级级审查
        AuthService.auth("1003",orderId);
        handler.logger.info("模拟三级审查：开发者小尚正在审查业务！！！");
        handler.logger.info("审查结果：{}",JSON.toJSONString(handler.doAuth(orderName,orderId,parse)));

        // 模拟二级级审查
        AuthService.auth("1002",orderId);
        handler.logger.info("模拟二级审查：王经理正在审查业务！！！");
        handler.logger.info("审查结果：{}",JSON.toJSONString(handler.doAuth(orderName,orderId,parse)));

        // 模拟一级级审查
        AuthService.auth("1001",orderId);
        handler.logger.info("模拟三级审查：周老板正在审查业务！！！");
        handler.logger.info("审查结果：{}",JSON.toJSONString(handler.doAuth(orderName,orderId,parse)));
    }
}
