package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 员工类
 * @author: Shang
 * @create: 2024-11-23 21:04
 * @version: 1.0
 **/
public class Employ {
    private String name;
    public Employ(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println("Employee："+name);
    }
}
