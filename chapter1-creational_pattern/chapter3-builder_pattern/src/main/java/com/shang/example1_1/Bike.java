package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 自行车-具体产品
 * @author: Shang
 * @create: 2024-10-29 17:18
 * @version: 1.0
 **/
public class Bike {
    private String frame;
    private String seat;

    public Bike(){

    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bike{");
        sb.append("frame='").append(frame).append('\'');
        sb.append(", seat='").append(seat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
