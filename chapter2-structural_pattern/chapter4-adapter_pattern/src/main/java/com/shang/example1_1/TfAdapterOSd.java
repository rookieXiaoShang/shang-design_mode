package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 适配器将一个tf卡加卡套变为sd卡  类适配器 不够灵活
 * @author: Shang
 * @create: 2024-10-31 10:58
 * @version: 1.0
 **/
public class TfAdapterOSd extends TFCard implements ISD{

    @Override
    public String read() {
        System.out.println("adapter read tf card ");
        return super.display();
    }

    @Override
    public void write(String data) {
        System.out.println("adapter write tf card ");
        super.save(data);
    }
}
