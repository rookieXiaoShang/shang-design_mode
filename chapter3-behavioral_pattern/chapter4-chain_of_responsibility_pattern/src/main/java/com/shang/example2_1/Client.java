package com.shang.example2_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-01 20:57
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
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = f.parse("2024-11-16 00:00:00");// 审批时间
        String name = "研发小尚"; // 研发人员
        String orderId = "s128"; // 业务ID

        AuthController controller = new AuthController();

        System.out.println("=========进入审查=========");
        AuthInfo info0 = controller.authInfo(name,orderId,parse);
        System.out.println("当前审核状态："+info0.getInfo());
        // 开始三级审查
        if("100".equals(info0.getCode())) {
            AuthService.auth("1003", orderId);
            System.out.println("三级审核人王经理完成了业务ID：" + orderId + "的审查!!!");
        }else if("200".equals(info0.getCode())) {
            return;
        }
        System.out.println("===========================================================================");
        AuthInfo info1 = controller.authInfo(name,orderId,parse);
        System.out.println("当前审核状态:  " + info1.getInfo());
        if("100".equals(info1.getCode())) {
            AuthService.auth("1002",orderId);
            System.out.println("二级审核人钱经理完成了业务ID："+ orderId+"的审查!!!");
        }else if("200".equals(info1.getCode())) {
            return;
        }

        System.out.println("===========================================================================");
        AuthInfo info2 = controller.authInfo(name,orderId,parse);
        System.out.println("当前审核状态:  " + info2.getInfo());
        if("100".equals(info2.getCode())) {
            AuthService.auth("1001", orderId);
            System.out.println("一级审核人赵经理完成了业务ID：" + orderId + "的审查!!!");
        }else if("200".equals(info2.getCode())) {
            return;
        }

    }
}
