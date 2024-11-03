package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 具体的装饰器
 * @author: Shang
 * @create: 2024-10-31 09:48
 * @version: 1.0
 **/
public class DecoratorA extends DecoratorComponent{
    // 实现构造器
    public DecoratorA(Component component) {
        super(component);
    }
    // 重写操作方法
    @Override
    public void operation() {
        System.out.println("DecoratorA 修饰前");
        super.operation();
        System.out.println("DecoratorA 修饰后");
    }
}
