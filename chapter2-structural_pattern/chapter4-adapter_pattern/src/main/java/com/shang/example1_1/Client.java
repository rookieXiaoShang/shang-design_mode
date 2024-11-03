package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 11:00
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer(new SDCard());
        System.out.println(computer.read());
        computer.write("hello");

        System.out.println("========================");
        TfAdapterOSd toSd = new TfAdapterOSd();
        Computer computer2 = new Computer(toSd);
        System.out.println(computer2.read());
        computer2.write("hello2");

        TFCard tf = new TFCard();
        // Computer computer1 = new Computer(tf);
    }
}
