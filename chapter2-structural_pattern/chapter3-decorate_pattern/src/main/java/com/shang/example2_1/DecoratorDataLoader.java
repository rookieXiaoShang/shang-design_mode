package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 基础装饰器构件
 * @author: Shang
 * @create: 2024-10-31 10:04
 * @version: 1.0
 **/
public class DecoratorDataLoader implements DataLoader{
    // 维护一个基础构件
    private DataLoader dataLoader;
    public DecoratorDataLoader(DataLoader dataLoader) {
        this.dataLoader = dataLoader;
    }

    @Override
    public String read() {
        return dataLoader.read();
    }

    @Override
    public void write(String data) {
        dataLoader.write(data);
    }
}
