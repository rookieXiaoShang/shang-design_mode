package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象装饰器（实现的还是基础的功能）
 * @author: Shang
 * @create: 2024-10-31 09:47
 * @version: 1.0
 **/
public class DecoratorComponent implements Component{
    // 构造器维护一个基础构件
    private Component component;
    public DecoratorComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
