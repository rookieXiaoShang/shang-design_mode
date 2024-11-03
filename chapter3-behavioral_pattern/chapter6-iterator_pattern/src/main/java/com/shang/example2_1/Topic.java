package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 主题类
 * @author: Shang
 * @create: 2024-11-02 20:59
 * @version: 1.0
 **/
public class Topic {
    private String name;

    public Topic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
