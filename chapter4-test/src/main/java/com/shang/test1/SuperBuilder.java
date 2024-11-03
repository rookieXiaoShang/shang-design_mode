package com.shang.test1;

/**
 * @program: shang-design_mode
 * @description: 高级建造者模式
 * @author: Shang
 * @create: 2024-10-30 16:48
 * @version: 1.0
 **/
public class SuperBuilder {
    // 妙手就在这里 静态内部类的实例化是要外部类实例化的 但是存在的构造器又要传入静态内部类对象 及时不用private使用反射也无法破坏构造过程
    private SuperBuilder(Builder builder) {

    }
    // 这是一个建造者 只不过是内部类
    public static class Builder{
        // 属性都是私有的
        // 存在set方法 但是返回值是this 也就是Builder类 public
        // 里面有一个builder方法 实际上充当指挥者来指挥建造具体的外部类实例 return newSuperBuilder(this) public
    }
    // 可以写业务方法
}
