package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 门面类
 * @author: Shang
 * @create: 2024-10-31 11:16
 * @version: 1.0
 **/
public class Facade {
    // 维护子系统对象
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    // 总体的方法调用
    public void facadeMethod() {
        subSystemA.method();
        subSystemB.method();
        subSystemC.method();
    }
}
