package com.shang.example1_2;

import com.shang.example1_1.ConcretePrototype;

import java.io.Serializable;

/**
 * @program: shang-design_mode
 * @description: 测试深克隆
 * @author: Shang
 * @create: 2024-10-29 20:08
 * @version: 1.0
 **/
public class ConcretePrototype1 implements Cloneable, Serializable {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void show(){
        System.out.println("嫌疑人姓名: " +person.getName());
    }

    public ConcretePrototype1() {
        System.out.println("具体的原型对象创建完成!");
    }

    @Override
    public ConcretePrototype1 clone() throws CloneNotSupportedException {
        System.out.println("引用属性Person的克隆");
         Person clone = person.clone();
        this.setPerson(clone);

        System.out.println("具体的原型对象复制成功!");
        return (ConcretePrototype1)super.clone();
    }

}
