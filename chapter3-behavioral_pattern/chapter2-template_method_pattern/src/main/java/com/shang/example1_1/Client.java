package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 21:17
 * @version: 1.0
 **/
public class Client {
    /*
    测试策略模式的具体成员
    抽象模板类：存储基础的模板样式 一般是step1 step2等以及一个具体的运行方法run 可以直接调用step1等方法
            方法分为  抽象方法：子类中必须要实现的方法
                    具体方法：在抽象类中就已经实现的方法，子类中可以根据场景决定是否重写该方法
                    钩子方法：一般含有判断逻辑 根据逻辑结果不同调用不同的step方法
    具体模版类：抽象模板类的具实现

    体现的设计原则：
    开闭原则（对修改关闭 对扩展开放）   里氏替换原则（接口与实现类）
    违反的设计原则：
    接口分离原则，对于接口或者抽象类来说，可能会设计的过于庞大
    单一职责原则：抽象中定义了各式各样的方法 但整体为了一个run方法服务

     */
    public static void main(String[] args) {
        AbstractClassTemplate classTemplate = new ConcreteClassA();
        classTemplate.run("x");

        System.out.println("=============");

        AbstractClassTemplate classTemplate1 = new ConcreteClassB();
        classTemplate1.run("y");
    }
}
