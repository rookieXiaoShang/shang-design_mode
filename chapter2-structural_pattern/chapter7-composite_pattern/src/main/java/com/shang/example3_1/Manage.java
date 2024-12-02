package com.shang.example3_1;

import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 管理类
 * @author: Shang
 * @create: 2024-11-23 21:07
 * @version: 1.0
 **/
public class Manage {
    private String name;
    private List<Department> departments;
    public Manage(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> teams) {
        this.departments = teams;
    }

    public void printName() {
        System.out.println("Manage："+name);
        for (Department department : departments) {
            department.printName();
        }
    }

}
