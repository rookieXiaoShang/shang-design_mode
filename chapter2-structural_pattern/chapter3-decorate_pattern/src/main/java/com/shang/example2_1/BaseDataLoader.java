package com.shang.example2_1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @program: shang-design_mode
 * @description: 基础功能实现
 * @author: Shang
 * @create: 2024-10-31 09:59
 * @version: 1.0
 **/
public class BaseDataLoader implements DataLoader{
    private String filePath;
    public BaseDataLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        try {
            String s = FileUtils.readFileToString(new File(filePath), "utf-8");
            return s;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(String data) {
        try {
            FileUtils.write(new File(filePath),data,"utf-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
