package com.shang.example2_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 遥控器 命令调用者
 * @author: Shang
 * @create: 2024-11-06 11:21
 * @version: 1.0
 **/
public class ControllerPanel {
    // 维护命令
    private static List<ICommand> commandList;
    public ControllerPanel() {
        commandList = new ArrayList<ICommand>();
        System.out.println("command numbers: " + commandList.size());
    }
    // 添加命令
    public void addCommand(ICommand command) {
        if(null != command) {
            commandList.add(command);
            System.out.println("command numbers: " + commandList.size());
        }
    }
    // 删除命令
    public void removeCommand(Integer index) {
        if(index < commandList.size()) {
            ICommand iCommand = commandList.get(index);
            commandList.remove(iCommand);
            System.out.println("command numbers: " + commandList.size());
        }
    }
    // 执行命令
    public void executeCommandByIndex(int index) {
        ICommand iCommand = commandList.get(index);
        iCommand.execute();
    }
    // 快速执行
    public void executeQuickAllCommands() {
        if(commandList.size() == 0) {
            System.out.println("No commands executed");
        }
        for(ICommand iCommand : commandList) {
            iCommand.execute();
        }
    }
}
