package com.shang.example3_2;


/**
 * @program: shang-design_mode
 * @description: 员工类
 * @author: Shang
 * @create: 2024-11-23 21:24
 * @version: 1.0
 **/
public class Employee implements IComponent{
    private String name;
    public Employee(String name){
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Employee："+name);
    }
}
