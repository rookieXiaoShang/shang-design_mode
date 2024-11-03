package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 电脑类
 * @author: Shang
 * @create: 2024-10-31 10:51
 * @version: 1.0
 **/
public class Computer {
    // 电脑只能使用sd卡
    private ISD isd;
    public Computer(ISD isd) {
        this.isd = isd;
    }

    // 电脑实现读功能
    public String read(){
        return isd.read();
    }
    // 电脑实现写功能
    public void write(String s){
        isd.write(s);
    }
}
