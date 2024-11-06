package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-06 11:07
 * @version: 1.0
 **/
public class Client {
    /*
    执行一个智能家居控制
    命令执行者：电脑，灯，门 都有打开或者关闭的功能
    命令调用者：遥控器，要引用一个命令集合，可以对不同的设备进行遥控开关
    抽象命令：execute具体执行开关命令
    具体命令：实现execute 引用命令调用者
     */
    public static void main(String[] args) {
        ControllerPanel panel= new ControllerPanel();
        // 添加命令
        panel.addCommand(new ComputerCommandOn());
        panel.addCommand(new DoorCommandOn());
        panel.addCommand(new LightCommandOn());

        // 执行命令
        System.out.println("快速执行===================");
        panel.executeQuickAllCommands();
        System.out.println("单个执行===================");
        panel.executeCommandByIndex(1);

        // 删除命令
        panel.removeCommand(3);
        panel.executeQuickAllCommands();
    }
}
