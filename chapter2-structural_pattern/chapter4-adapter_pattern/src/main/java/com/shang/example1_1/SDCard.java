package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: sd卡实现类
 * @author: Shang
 * @create: 2024-10-31 10:53
 * @version: 1.0
 **/
public class SDCard implements ISD{
    @Override
    public String read() {
        return "SD卡读取数据";
    }

    @Override
    public void write(String data) {
        System.out.println("cd write data： " + data);
    }
}
