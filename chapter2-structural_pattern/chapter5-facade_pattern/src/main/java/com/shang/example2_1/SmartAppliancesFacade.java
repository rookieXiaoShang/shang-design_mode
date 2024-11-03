package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 智能家电门面类
 * @author: Shang
 * @create: 2024-10-31 11:24
 * @version: 1.0
 **/
public class SmartAppliancesFacade {
    private static final Light light = new Light();;
    private static final TV tv = new TV();
    private static final AirCondition airCondition = new AirCondition();

    public static void on(){
        light.on();
        tv.playTv();
        airCondition.on();
    }
    public static void off(){
        light.off();
        tv.offTv();
        airCondition.off();
    }

}
