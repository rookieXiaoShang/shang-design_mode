package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 上下文类
 * @author: Shang
 * @create: 2024-11-02 19:19
 * @version: 1.0
 **/
public class Context {
    // 维护一个状态类
    private IState currentState = null;
    public Context(){

    }
    // 设置状态
    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }
    // 返回状态
    public IState getCurrentState() {
        return currentState;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Context{");
        sb.append("state=").append(currentState);
        sb.append('}');
        return sb.toString();
    }
}
