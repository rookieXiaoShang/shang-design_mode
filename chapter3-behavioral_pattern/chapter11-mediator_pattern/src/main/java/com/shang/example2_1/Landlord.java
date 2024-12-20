package com.shang.example2_1;



/**
 * @program: shang-design_mode
 * @description: 房东
 * @author: Shang
 * @create: 2024-11-03 20:35
 * @version: 1.0
 **/
public class Landlord extends IPerson {
    public Landlord(String name, IMediator mediator) {
        super(name, mediator);
    }

    //与中介者联系
    public void contact(String message){
        mediator.contact(message,this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("房主" + name + "获取到的信息: " + message);
    }
}
