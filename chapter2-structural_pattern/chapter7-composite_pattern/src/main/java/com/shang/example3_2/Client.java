package com.shang.example3_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-23 21:32
 * @version: 1.0
 **/
public class Client {
    /*
    * 组合模式的安全方法 只暴露容器和叶子结点的通用方法 封装叶子，容器的基础属性
    * */
    public static void main(String[] args) {
        Employee employee0 = new Employee("小赵");
        Employee employee1 = new Employee("小钱");
        Employee employee2 = new Employee("小孙");
        Employee employee3 = new Employee("小李");
        Designer designer0 = new Designer("小尚");
        List<IComponent> employees = new ArrayList<IComponent>();
        employees.add(employee0);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(designer0);

        Team team = new Team("周组长");
        team.setEmployList(employees);
        team.printName();

        Department department = new Department("吴部长");
        department.setTeams(List.of(team));
        department.printName();
    }
}
