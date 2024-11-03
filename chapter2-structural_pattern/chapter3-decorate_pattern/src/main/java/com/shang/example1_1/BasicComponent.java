package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 基础构件实现
 * @author: Shang
 * @create: 2024-10-31 09:45
 * @version: 1.0
 **/
public class BasicComponent implements Component{
    @Override
    public void operation() {
        System.out.println("构建的基础实现！！！");
    }
}
