package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 装饰器
 * @author: Shang
 * @create: 2024-10-31 09:51
 * @version: 1.0
 **/
public class DecoratorAA extends DecoratorA{
    public DecoratorAA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("DecoratorAA operation");
        super.operation();
    }
}
