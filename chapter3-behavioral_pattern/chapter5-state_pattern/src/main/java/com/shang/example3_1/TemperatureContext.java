package com.shang.example3_1;

/**
 * @program: shang-design_mode
 * @description: 温度上下文
 * @author: Shang
 * @create: 2024-11-03 10:17
 * @version: 1.0
 **/
public class TemperatureContext {
    // 维护构造器
    public TemperatureContext() {
    }
    public TemperatureContext(IWaterState state) {
        this.state = state;
    }

    // 维护一个状态类 初始状态设置为水
    private IWaterState state = new Water();
    // 维护创建和获取状态的方法
    public void setState(IWaterState state) {
        this.state = state;
    }
    public IWaterState getState(){
        return state;
    }

    // 业务方法
    public IWaterState toAir(){
        // state的业务方法中引入了context 可以使用context的setSate方法修改context内部的state状态并且返回
        // 调用的时候传入this 要使用的是this中的state状态
        state.toAir(this);
        return state;
    }
    public IWaterState toWater(){
        // state的业务方法中引入了context 可以使用context的setSate方法修改context内部的state状态并且返回
        // 调用的时候传入this 要使用的是this中的state状态
        state.toWater(this);
        return state;
    }
    public IWaterState toIce(){
        // state的业务方法中引入了context 可以使用context的setSate方法修改context内部的state状态并且返回
        // 调用的时候传入this 要使用的是this中的state状态
        state.toIce(this);
        return state;
    }

    // toString方法
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TemperatureContext{");
        sb.append("state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
