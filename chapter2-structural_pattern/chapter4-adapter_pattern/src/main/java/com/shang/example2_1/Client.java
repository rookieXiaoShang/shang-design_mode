package com.shang.example2_1;

import com.shang.example1_1.Computer;
import com.shang.example1_1.ITF;
import com.shang.example1_1.TFCard;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 11:09
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ITF tf = new TFCard();
        TfAdapterSd2 adapterSd = new TfAdapterSd2(tf);
        Computer computer = new Computer(adapterSd);

        computer.write("hello 对象适配器");
        computer.read();
    }
}
