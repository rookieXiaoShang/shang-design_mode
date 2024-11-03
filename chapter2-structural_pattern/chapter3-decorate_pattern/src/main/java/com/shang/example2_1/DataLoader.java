package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 文件加载者（顶层抽象）
 * @author: Shang
 * @create: 2024-10-31 09:57
 * @version: 1.0
 **/
public interface DataLoader {
    String read();
    void write(String data);
}
