package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 门的开关命令
 * @author: Shang
 * @create: 2024-11-06 11:19
 * @version: 1.0
 **/
public class DoorCommandOff implements ICommand{
    // 引用命令执行者
    private static final Door DOOR = new Door();
    @Override
    public void execute() {
        DOOR.powerOff();
    }
}
