package com.shang.example7_1;
/**
 * @program: shang-design_mode
 * @description: 枚举类的单例模式
 * @author: Shang
 * @create: 2024-10-25 12:01
 * @version: 1.0
 **/
public enum Singleton7 {
    // 枚举类的实例要写在第一行
    INSTANCE("shang");
    // 设置属性
    private Object data;
    // 私有构造器 要符合内部属性的设置
    Singleton7(Object data) {
        this.data = data;
    }
    public Object getDada(){
        return data;
    }

    // 返回一个实例对象
    public static Singleton7 getInstance(){
        return INSTANCE;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Singleton7{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
    /*
    枚举类可以防止反射序列化的破坏
    对于反射首先枚举类没有空参构造器 其次就算传入参数反射低层也不容许实例化对象
    对于序列化返回的知识枚举对象名 反序列使用valueOf(名字)来读取对象
     */

    // 缺点在于我发在继承场景中使用 因为enum是一个final类 所以前面的存在缺陷的单例模式有着自己的作用
}
