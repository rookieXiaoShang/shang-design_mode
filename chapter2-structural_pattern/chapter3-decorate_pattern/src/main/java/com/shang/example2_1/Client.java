package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 10:15
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        BaseDataLoader baseDataLoader = new BaseDataLoader("shang.txt");
        // baseDataLoader.write("hello shang");
        String read = baseDataLoader.read();
        System.out.println("文件读取内容: "+read);

        DecoratorA decoratorA = new com.shang.example2_1.DecoratorA(new BaseDataLoader("./yong.txt"));
        decoratorA.write("hello yong");
        String read1 = decoratorA.read();
        System.out.println("read1 = " + read1);
    }
}
