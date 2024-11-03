package com.shang.test;

import com.shang.example1_1.ConcretePrototype;
import com.shang.example1_2.ConcretePrototype1;
import com.shang.example1_2.Person;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @program: shang-design_mode
 * @description: 测试深浅克隆与原型模式
 * @author: Shang
 * @create: 2024-10-29 20:02
 * @version: 1.0
 **/
public class Client {
    // 测试浅克隆
    @Test
    public void test1_1() throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        ConcretePrototype clone = concretePrototype.clone();
        System.out.println(concretePrototype == clone);
    }

    // (Person还未实现克隆之前)测试还是浅克隆
    @Test
    public void test1_2_1() throws CloneNotSupportedException {
        ConcretePrototype1 c1 = new ConcretePrototype1();
        Person p1 = new Person();
        c1.setPerson(p1);

        //复制c1
        ConcretePrototype1 c2 = c1.clone();
        //获取复制对象c2中的Person对象
        Person p2 = c2.getPerson();
        p2.setName("峰哥");

        //判断p1与p2是否是同一对象
        System.out.println("p1和p2是同一个对象？" + (p1 == p2));

        c1.show();
        c2.show();
    }

    // 使用序列化实现深克隆
    @Test
    public void test1_2_2() throws Exception{
        ConcretePrototype1 c1 = new ConcretePrototype1();
        Person p1 = new Person("峰哥");
        c1.setPerson(p1);

        //创建对象序列化输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c.txt"));

        //将c1对象写到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象序列化输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c.txt"));

        //读取对象
        ConcretePrototype1 c2 = (ConcretePrototype1) ois.readObject();
        Person p2 = c2.getPerson();
        p2.setName("凡哥");

        //判断p1与p2是否是同一个对象
        System.out.println("p1和p2是同一个对象?" + (p1 == p2));

        c1.show();
        c2.show();
    }


}
