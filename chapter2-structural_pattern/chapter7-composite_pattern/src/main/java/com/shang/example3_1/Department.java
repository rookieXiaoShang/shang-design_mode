package com.shang.example3_1;

import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 部门类
 * @author: Shang
 * @create: 2024-11-23 21:07
 * @version: 1.0
 **/
public class Department {
    private String name;
    private List<Team> teams;
    public Department(String name) {
        this.name = name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void printName() {
        System.out.println("Department："+name);
        for(Team team : teams) {
            team.printName();
        }
    }

}
