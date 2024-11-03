package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 11:20
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.facadeMethod();
    }
}
