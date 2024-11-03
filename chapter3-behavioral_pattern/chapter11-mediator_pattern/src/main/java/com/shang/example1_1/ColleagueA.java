package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 同事A
 * @author: Shang
 * @create: 2024-11-03 20:22
 * @version: 1.0
 **/
public class ColleagueA extends IColleague{
    public ColleagueA(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void execute(String key) {
        getMediator().apply(key);
    }
}
