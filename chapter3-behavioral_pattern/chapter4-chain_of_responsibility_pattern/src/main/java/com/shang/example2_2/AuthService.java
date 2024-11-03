package com.shang.example2_2;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: shang-design_mode
 * @description: 审核方法
 * @author: Shang
 * @create: 2024-11-02 16:03
 * @version: 1.0
 **/
public class AuthService {
    private static Map<String, Date> authMap = new ConcurrentHashMap<>();
    private AuthService(){
        throw new AssertionError();
    }
    public static void auth(String levelId,String orderId){
        System.out.println("等级编号为"+levelId+"正在审查"+orderId+"业务");
        authMap.put(levelId.concat(orderId),new Date());
    }
    public static Date queryAuth(String levelId,String orderId){
        return authMap.get(levelId.concat(orderId));
    }
}
