package com.shang.example3_1;

import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 团队类
 * @author: Shang
 * @create: 2024-11-23 21:14
 * @version: 1.0
 **/
public class Team {
    private String name;
    private List<Employ> employList;
    public Team(String name) {
        this.name = name;
    }

    public List<Employ> getEmployList() {
        return employList;
    }

    public void setEmployList(List<Employ> employList) {
        this.employList = employList;
    }
    public void printName(){
        System.out.println("Team："+name);
        for (Employ employ : employList) {
            employ.printName();
        }
    }
}
