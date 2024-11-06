package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 开电脑命令
 * @author: Shang
 * @create: 2024-11-06 11:15
 * @version: 1.0
 **/
public class ComputerCommandOff implements ICommand{
    // 引用一个命令执行者
    private Computer computer = new Computer();
    @Override
    public void execute() {
        computer.powerOff();
    }
}
