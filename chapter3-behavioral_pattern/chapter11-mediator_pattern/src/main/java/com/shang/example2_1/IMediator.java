package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 抽象中介者
 * @author: Shang
 * @create: 2024-11-03 20:36
 * @version: 1.0
 **/
public interface IMediator {
    //申明一个联络方法
    public abstract void contact(String message,IPerson person);
}
