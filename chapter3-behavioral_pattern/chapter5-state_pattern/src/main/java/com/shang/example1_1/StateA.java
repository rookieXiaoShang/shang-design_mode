package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 状态A
 * @author: Shang
 * @create: 2024-11-02 19:20
 * @version: 1.0
 **/
public class StateA implements IState{
    @Override
    public void handle(Context context) {
        System.out.println("执行状态A");
        context.setCurrentState(this);
    }
    @Override
    public String toString() {
        return "当前状态：StateA";
    }
}
