package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 交通灯上下文类
 * @author: Shang
 * @create: 2024-11-02 20:15
 * @version: 1.0
 **/
public class TrafficLight {
    // 维护一个状态
    private ILightState state = new RedLight();
    // 设置一个红灯
    public void setState(ILightState state) {
        this.state = state;
    }
    // 查看一个状态
    public ILightState getState() {
        return state;
    }
    public void switchToGreenLight() {
        state.toGreen(this);
    }
    public void switchToYellowLight() {
        state.toYellow(this);
    }
    public void switchToRedLight() {
        state.toRed(this);
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TrafficLight{");
        sb.append("state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
