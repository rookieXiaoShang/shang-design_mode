package com.shang.example2_1;

import java.util.Base64;

/**
 * @program: shang-design_mode
 * @description: 增加加密解密的方法
 * @author: Shang
 * @create: 2024-10-31 10:06
 * @version: 1.0
 **/
public class DecoratorA extends DecoratorDataLoader{
    public DecoratorA(DataLoader dataLoader) {
        super(dataLoader);
    }

    // 实现解密操作
    @Override
    public String read() {
        return decode(super.read());
    }
    // 实现加密操作

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    //加密操作
    private String encode(String data) {
        try {
            Base64.Encoder encoder = Base64.getEncoder();
            byte[] bytes = data.getBytes("UTF-8");
            String result = encoder.encodeToString(bytes);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //解密
    private String decode(String data) {

        try {
            Base64.Decoder decoder = Base64.getDecoder();
            String result = new String(decoder.decode(data), "UTF-8");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
