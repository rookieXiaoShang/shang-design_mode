package com.shang.test;

import com.shang.example1_1.Bike;
import com.shang.example1_1.BuilderA;
import com.shang.example1_1.BuilderB;
import com.shang.example1_1.Director;
import org.junit.Test;

/**
 * @program: shang-design_mode
 * @description: 测试建造者模式
 * @author: Shang
 * @create: 2024-10-29 17:33
 * @version: 1.0
 **/
public class Client {
    // 测试example1_1普通建造者
    @Test
    public void test1_1(){
        Director director = new Director(new BuilderA());
        Bike bike = director.constructBike();
        // 接口中的final bike是一个引用属性 所以不变的只是引用地址 所以可以使用接口或者是抽象类作为builder父类
        bike.setSeat("修改后的真皮坐垫");
        System.out.println(bike);

        Director director2 = new Director(new BuilderB());
        Bike bike2 = director2.constructBike();
        System.out.println(bike2);
    }

}
