package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 发起人类
 * @author: Shang
 * @create: 2024-10-23 19:49
 * @version: 1.0
 **/
public class Originator {
    private String state = "原始类";
    private String id;
    private String name;
    private String phone;

    public Originator() {
    }
    // 创建备忘录类
    public Memento create(){
        return new Memento(id,name,phone);
    }
    // 恢复对象状态
    public void restore(Memento m){
        // 这个状态只是起到了一个标识性的作用
        this.state = m.getState();
        this.id = m.getId();
        this.name = m.getName();
        this.phone = m.getPhone();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Originator{");
        sb.append("state='").append(state).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
