package com.shang.example2_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 抽象处理者
 * @author: Shang
 * @create: 2024-11-02 16:07
 * @version: 1.0
 **/
public abstract class IAuthHandler {
    // 维护levelName 和 levelId
    protected String levelName;
    protected String levelId;
    public IAuthHandler(String levelName, String levelId) {
        this.levelName = levelName;
        this.levelId = levelId;
    }
    // 维护时间格式
    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // 维护日志
    public Logger logger = LoggerFactory.getLogger(IAuthHandler.class);
    // 维护一个nextHandler
    private IAuthHandler nextHandler;
    // 设置nextHandler
    public IAuthHandler appendNext(IAuthHandler nextHandler){
        this.nextHandler = nextHandler;
        // 注意返回的是自己 还要调用自己的相关业务方法
        return this;
    }
    // 获取nextHandler
    public IAuthHandler getNextHandler(){
        return nextHandler;
    }
    // 维护一个抽象方法
    public abstract AuthInfo doAuth(String orderName, String orderId, Date authDate);
}
