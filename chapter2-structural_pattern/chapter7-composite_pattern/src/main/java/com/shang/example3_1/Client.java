package com.shang.example3_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-23 21:02
 * @version: 1.0
 **/
public class Client {
    /*
    实现一个公司架构
    一个team下面有n个员工
    一个department下面有n个team
    一个manage下面有多个department

    如果一个team中不仅仅包含employ 还包含designer，teacher等等，如何添加team集合 如何for循环中进行类型强转使用他们特定的方法 ？
    如果部门之间又出现了一个新部门，又该如何修改代码？

    使用组合模式
     */
    public static void main(String[] args) {
        Employ employ0 = new Employ("小尚");
        Employ employ1 = new Employ("小赵");
        Employ employ2 = new Employ("小钱");
        Employ employ3 = new Employ("小孙");
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(employ0);
        employList.add(employ1);
        employList.add(employ2);
        employList.add(employ3);

        System.out.println("==================================");
        Team team = new Team("李组长");
        team.setEmployList(employList);
        team.printName();

        System.out.println("==================================");
        Department department = new Department("雪部长");
        department.setTeams(List.of(team));
        department.printName();

        System.out.println("==================================");
        Manage manage = new Manage("王老板");
        manage.setDepartments(List.of(department));
        manage.printName();
    }
}
