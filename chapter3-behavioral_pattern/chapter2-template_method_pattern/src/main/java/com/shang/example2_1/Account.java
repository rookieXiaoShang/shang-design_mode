package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 抽象模板account
 * @author: Shang
 * @create: 2024-10-31 21:20
 * @version: 1.0
 **/
public abstract class Account {
    private void step1(String name,String password){
        if(step2(name,password)){
            System.out.println("系统登录成功！！！");
            step3();
        }else {
            step4();
        }
    }
    // 判断登录是否成功
    private boolean step2(String name,String password){
        return "shang".equals(name) && "123456".equals(password);
    }
    // 计算利息
    public abstract void step3();
    // 显示登录失败
    private void step4(){
        System.out.println("密码错误，系统登录失败！！！");
    }
    // 显示系统利息
    private void step5(){
        System.out.println("系统利息为：");
        step3();
    }
    public void run(String name,String password){
        step1(name,password);
        step5();
    }
}
