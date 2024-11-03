package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 21:35
 * @version: 1.0
 **/
public class Client {
    /*
    1. 用户登录系统,登录时需要输入账号密码,如果登录失败(比如用户密码错误),系统需要给出提示
    2. 如果用户登录成功,则根据用户的借款的类型不同,使用不同的利息计算方式进行计算
    3. 系统需要显示利息.不管是否登陆成功！！！
     */
    public static void main(String[] args) {
        Account accountA = new AccountA();
        accountA.run("shang1","123456");

        System.out.println("==============");
        Account accountB = new AccountB();
        accountB.run("shang","123456");
    }
}
