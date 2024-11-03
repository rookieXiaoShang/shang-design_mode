package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 文件叶子结点
 * @author: Shang
 * @create: 2024-10-31 19:36
 * @version: 1.0
 **/
public class File extends Entry{
    // 维护自己的私有属性
    private String fileName;
    private Integer fileSize;
    public File(String fileName, Integer fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public Integer getSize() {
        return fileSize;
    }

    @Override
    public void addEntry(Entry entry) {
        // 再无增加子节点的可能性 可以再共性方法中删除
        // 在文件夹中作为一个特有的方法
    }

    // 只删除文件内容
    @Override
    public void removeEntry(Entry entry) {
        if (fileName.equals(entry.getName())){
            // 设置为"" 而不是null 否则会出现null + "prefix"拼接为一个字符串
            fileName = "";
            // null + 0 会出现空指针异常
            fileSize = 0;
        }else {
            throw new RuntimeException("文件不存在！！！");
        }
    }

    @Override
    public void printEntry(String prefix) {
        if(fileSize != 0){
            // 直接使用了父类重写的toString方法返回文件名和文件大小
            System.out.println(prefix + "/" +this);
        }
        System.out.print("");
    }

    @Override
    public String toString() {
        if(fileSize != 0){
            return super.toString();
        }else {
            return "";
        }
    }
}
