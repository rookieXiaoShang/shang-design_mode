package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 灯开关命令
 * @author: Shang
 * @create: 2024-11-06 11:17
 * @version: 1.0
 **/
public class LightCommandOff implements ICommand{
    // 引用命令执行者
    private Light light = new Light();
    @Override
    public void execute() {
        light.powerOff();
    }
}
