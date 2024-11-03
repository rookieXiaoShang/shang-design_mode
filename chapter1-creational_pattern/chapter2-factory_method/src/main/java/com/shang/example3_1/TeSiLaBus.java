package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 老马家的小车
 * @author: Shang
 * @create: 2024-10-30 16:07
 * @version: 1.0
 **/
public class TeSiLaBus implements IBus{
    @Override
    public void driver() {
        System.out.println("老马开着特斯拉公交车兜风！！！");
    }
}
