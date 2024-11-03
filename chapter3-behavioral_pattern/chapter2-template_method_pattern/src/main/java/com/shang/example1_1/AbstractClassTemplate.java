package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象模板类
 * @author: Shang
 * @create: 2024-10-31 21:10
 * @version: 1.0
 **/
public abstract class AbstractClassTemplate {
    // 钩子函数 有判断逻辑的分支
    void step1(String key){
        System.out.println("在模板类中 -> 执行步骤1");
        if(step2(key)){
            step3();
        }else{
            step4();
        }

        step5();
    }

    // 钩子函数
    boolean step2(String key){
        System.out.println("在模板类中 -> 执行步骤2");
        if("x".equals(key)){
            return true;
        }
        return false;
    }

    // 抽象方法 必须在子类中需要具体去实现
    abstract void step3();
    abstract void step4();

    // 具体方法 子类可以重写也可以不重写
    void step5(){
        System.out.println("在模板类中 -> 执行步骤5");
    }

    void run(String key){
        step1(key);
    }

}
