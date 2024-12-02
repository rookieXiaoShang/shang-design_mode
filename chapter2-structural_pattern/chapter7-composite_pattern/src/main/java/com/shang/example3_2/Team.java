package com.shang.example3_2;

import com.shang.example3_1.Employ;

import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 团队类
 * @author: Shang
 * @create: 2024-11-23 21:14
 * @version: 1.0
 **/
public class Team implements IComponent{
    private String name;
    private List<IComponent> employList;
    public Team(String name) {
        this.name = name;
    }

    public List<IComponent> getEmployList() {
        return employList;
    }

    public void setEmployList(List<IComponent> employList) {
        this.employList = employList;
    }
    @Override
    public void printName(){
        System.out.println("Team："+name);
        for (IComponent component : employList) {
            component.printName();
        }
    }
}
