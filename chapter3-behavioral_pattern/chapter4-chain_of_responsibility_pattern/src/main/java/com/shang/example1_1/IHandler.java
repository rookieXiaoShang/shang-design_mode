package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象处理者
 * @author: Shang
 * @create: 2024-11-01 15:33
 * @version: 1.0
 **/
public abstract class IHandler {
    // 维护一个successor 判断责任链是否结束
    protected IHandler successor = null;
    public void setHandler(IHandler successor){
        this.successor = successor;
    }
    public abstract void handleRequest(RequestData data);
}
