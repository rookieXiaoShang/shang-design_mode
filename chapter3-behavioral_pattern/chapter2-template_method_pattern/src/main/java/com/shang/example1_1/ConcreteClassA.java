package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象模板的实现类
 * @author: Shang
 * @create: 2024-10-31 21:14
 * @version: 1.0
 **/
public class ConcreteClassA extends AbstractClassTemplate{
    @Override
    void step3() {
        System.out.println("在子类A中执行步骤三！！！");
    }

    @Override
    void step4() {
        System.out.println("在子类A中执行步骤四！！！");
    }

}
