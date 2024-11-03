package com.shang.example1_2;


/**
 * @program: shang-design_mode
 * @description: 接待者接口（要接受一个Visitor)
 * @author: Shang
 * @create: 2024-11-03 15:36
 * @version: 1.0
 **/
public interface Acceptable {
    void accept(IVisitor visitor);
}
