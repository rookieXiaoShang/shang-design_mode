package com.shang.example2_1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 具体的审查方法
 * @author: Shang
 * @create: 2024-11-01 20:50
 * @version: 1.0
 **/
public class AuthService {
    private AuthService(){

    }
    // 维护一个集合存储审查结果
    public static Map<String, Date> authResult = new HashMap<String, Date>();

    // 审查记录 将审查uid+orderId 和 时间存储在集合中就是完成了审查
    public static void auth(String uid,String orderId){
        System.out.println("进入审批流程,审批人ID: " + uid);
        authResult.put(uid+orderId, new Date());
    }
    // 查询审查 判断uid+orderId在集合中是否存在
    public static Date queryAuth(String uid,String orderId){
        return authResult.get(uid+orderId);
    }
}
