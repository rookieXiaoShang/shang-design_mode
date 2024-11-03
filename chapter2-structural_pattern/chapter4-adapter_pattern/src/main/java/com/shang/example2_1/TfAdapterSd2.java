package com.shang.example2_1;

import com.shang.example1_1.ISD;
import com.shang.example1_1.ITF;

/**
 * @program: shang-design_mode
 * @description: 对象适配器
 * @author: Shang
 * @create: 2024-10-31 11:07
 * @version: 1.0
 **/
public class TfAdapterSd2 implements ISD {
    // 维护一个TF对象
    private ITF itf;
    public TfAdapterSd2(ITF itf) {
        this.itf = itf;
    }

    @Override
    public String read() {
        System.out.println("adapter read tf card ");
        return itf.display();
    }

    @Override
    public void write(String data) {
        System.out.println("adapter read tf card ");
        itf.save(data);
    }
}
