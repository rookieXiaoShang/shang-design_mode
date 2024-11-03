package com.shang.example1_1;

import java.util.ArrayList;

/**
 * @program: shang-design_mode
 * @description: 服务员 命令的调用者
 * @author: Shang
 * @create: 2024-10-22 11:22
 * @version: 1.0
 **/
public class Waiter {
    // 使用集合维护命令对象 关键在于对于命令的接收 和 对具体的工作者发出命令
    private static ArrayList<ICommand> commands;

    public Waiter() {
        this.commands = new ArrayList<>();
    }

    public Waiter(ArrayList<ICommand> commands) {
        this.commands = commands;
    }

    public ArrayList<ICommand> getCommands() {
        return commands;
    }

    public void setCommands(ICommand command) {
        this.commands.add(command);
    }

    // 调用真正的做菜命令
    public void orderUp(){
        System.out.println("服务员: 叮咚,有新的订单,请厨师开始制作......");
        for (ICommand cmd : commands) {
            // 注意代码的健壮性
            if(cmd != null){
                cmd.execute();
            }
        }
    }
}
