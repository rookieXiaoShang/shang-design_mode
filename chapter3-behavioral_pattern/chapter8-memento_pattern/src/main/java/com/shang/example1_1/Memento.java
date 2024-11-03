package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 备忘录类
 * @author: Shang
 * @create: 2024-10-23 19:51
 * @version: 1.0
 **/
public class Memento {
    private String state = "从备份类恢复为原始类";
    private String id;
    private String name;
    private String phone;

    public Memento(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Memento{");
        sb.append("state='").append(state).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
