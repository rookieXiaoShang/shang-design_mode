package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 文件文件夹共同实体类
 * @author: Shang
 * @create: 2024-10-31 19:30
 * @version: 1.0
 **/
public abstract class Entry {
    // 返回文件（文件夹）名字 和 内容大小 具体的属性维护放在实现类中 文件和文件夹都有自己特有的属性
    public abstract String getName();
    public abstract Integer getSize();

    // 添加文件 删除文件 注意叶子结点再无子类 容器节点可能会有子类
    public abstract void addEntry(Entry entry);
    public abstract void removeEntry(Entry entry);

    // 操作方法
    public abstract void printEntry(String prefix);

    // 重写toString方法
    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
