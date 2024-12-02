package com.shang.example3_2;

import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 管理者类
 * @author: Shang
 * @create: 2024-11-23 21:27
 * @version: 1.0
 **/
public class Manage implements IComponent{
    private String name;
    List<Department> departments;
    public Manage(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public void printName() {
        System.out.println("Manage："+name);
        for (Department department : departments) {
            department.printName();
        }
    }
}
