package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 具体处理者A
 * @author: Shang
 * @create: 2024-11-01 20:22
 * @version: 1.0
 **/
public class HandlerA extends IHandler{
    // 实现处理者处理逻辑
    @Override
    public void handleRequest(RequestData data) {
        System.out.println("执行handler逻辑！！！处理："+data.getMessage());
        data.setMessage(data.getMessage().replace("A",""));
        // 判断责任链是否完成
        if(successor != null){
            successor.handleRequest(data);
        }else {
            return;
        }
    }
}
