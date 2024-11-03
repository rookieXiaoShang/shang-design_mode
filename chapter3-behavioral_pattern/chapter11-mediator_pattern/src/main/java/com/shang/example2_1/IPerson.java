package com.shang.example2_1;



/**
 * @program: shang-design_mode
 * @description: 抽象同事
 * @author: Shang
 * @create: 2024-11-03 20:35
 * @version: 1.0
 **/
public abstract class IPerson {
    protected String name;

    protected IMediator mediator;

    public IPerson(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
