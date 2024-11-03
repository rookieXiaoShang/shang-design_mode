package com.shang.example2_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 文件夹
 * @author: Shang
 * @create: 2024-10-31 19:42
 * @version: 1.0
 **/
public class Directory extends Entry{
    private String directoryName;
    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }
    // 维护一个容器集合
    private List<Entry> entries = new ArrayList<>();

    @Override
    public String getName() {
        return directoryName;
    }

    @Override
    public Integer getSize() {
        // 计算该文件夹下面所有的文件size之和
        Integer size = 0;
        for(Entry entry : entries) {
            // 是文件直接相加 是文件夹直接递归
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    @Override
    public void removeEntry(Entry entry) {
        if(entries.contains(entry)) {
            if(entry.getClass().equals(File.class)){
                // 先删除文件内容
                entry.removeEntry(entry);
                // 在将文件移除容器
                entries.remove(entry);
            }
            // 删除文件夹的同时删除文件夹下面所有的文件
            entries.remove(entry);
            // 还有一种实现思路是判断文件夹下面是否还存在文件 只有文件夹下面无文件才可以删除文件夹
        }else {
            System.out.println("文件夹不存在！！！");
        }
    }

    @Override
    public void printEntry(String prefix) {
        // 文件夹前面可能还有文件夹前缀
        System.out.println(prefix + "/" + this);
        for(Entry entry : entries) {
            // entry可能是文件夹 也可能是文件
            entry.printEntry("/" + directoryName);
        }
    }
}
