package com.shang.example2_1;

import java.util.Date;

/**
 * @program: shang-design_mode
 * @description: 抽奖结果
 * @author: Shang
 * @create: 2024-10-31 20:21
 * @version: 1.0
 **/
public class LotteryResult {
    private String uid; // 用户ID
    private String message; // 摇号结果
    private Date date; // 摇号时间

    public LotteryResult(String uid, String message, Date date) {
        this.uid = uid;
        this.message = message;
        this.date = date;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LotteryResult{");
        sb.append("uid='").append(uid).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
