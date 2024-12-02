package com.shang.example3_2;

/**
 * @program: shang-design_mode
 * @description: 设计师类
 * @author: Shang
 * @create: 2024-11-23 21:29
 * @version: 1.0
 **/
public class Designer implements IComponent{
    private String name;
    public Designer(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Designer：" + name);
    }
}
