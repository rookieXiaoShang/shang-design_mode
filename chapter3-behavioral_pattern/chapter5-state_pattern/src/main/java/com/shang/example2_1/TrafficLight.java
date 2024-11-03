package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 红绿灯
 * @author: Shang
 * @create: 2024-11-02 19:56
 * @version: 1.0
 **/
public class TrafficLight {
    private String state = "红";
    public void setState(String state) {
        this.state = state;
    }
    public void getState(){
        System.out.println(state);
    }
    public void toGreen(){
        if ("绿".equals(state)){
            System.out.println("当前状态为绿灯 无需转换");
        }else if("红".equals(state)){
            System.out.println("红灯不能转换为绿灯");
        }else if("黄".equals(state)){
            this.state = "绿";
            System.out.println("绿灯亮起30秒！");
        }
    }
    public void toRed(){
        if("红".equals(state)){
            System.out.println("当前状态为红灯 无需转化");
        }else if ("绿".equals(state)){
            System.out.println("红灯不能直接转为绿灯");
        }else if("黄".equals(state)){
            this.state = "红";
            System.out.println("红灯亮起60秒！");
        }
    }
    public void toYellow(){
        if("红".equals(state)){
            System.out.println("红灯转换为黄灯");
            this.state = "黄";
        }else if("绿".equals(state)){
            System.out.println("绿灯转换为黄灯");
            this.state = "黄";
        }else {
            System.out.println("当前状态为黄灯 无需转换");
        }
    }
}
