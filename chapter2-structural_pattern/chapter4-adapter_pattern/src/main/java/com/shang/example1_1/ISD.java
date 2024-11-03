package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: sd卡接口
 * @author: Shang
 * @create: 2024-10-31 10:51
 * @version: 1.0
 **/
public interface ISD {
    String read();
    void write(String data);
}
