package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 抽象同事类
 * @author: Shang
 * @create: 2024-11-03 20:17
 * @version: 1.0
 **/
public abstract class IColleague {
    // 维护一个中介者
    private IMediator mediator;

    public IColleague(IMediator mediator) {
        this.mediator = mediator;
    }

    // 返回一个中介者
    public IMediator getMediator() {
        return mediator;
    }

    // 实现一个业务
    public abstract void execute(String key);
}
