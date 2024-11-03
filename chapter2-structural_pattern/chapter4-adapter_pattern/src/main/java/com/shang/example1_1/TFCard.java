package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: TF卡实现类
 * @author: Shang
 * @create: 2024-10-31 10:54
 * @version: 1.0
 **/
public class TFCard implements ITF{
    @Override
    public String display() {
        return "TF卡读数据";
    }

    @Override
    public void save(String data) {
        System.out.println("tf write data = " + data);
    }
}
