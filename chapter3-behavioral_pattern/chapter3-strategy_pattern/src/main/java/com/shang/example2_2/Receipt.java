package com.shang.example2_2;

import com.shang.example2_1.ReceiptType;

/**
 * @program: shang-design_mode
 * @description: 回执类
 * @author: Shang
 * @create: 2024-11-01 10:34
 * @version: 1.0
 **/
public class Receipt {
    private String message;
    private Enum<ReceiptType> type;
    // 构造器
    public Receipt() {
    }

    public Receipt(String message, Enum<ReceiptType> type) {
        this.message = message;
        this.type = type;
    }
    // set get
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // 这里直接使用枚举就可以了
    public Enum<ReceiptType> getType() {
        return type;
    }

    public void setType(Enum<ReceiptType> type) {
        this.type = type;
    }
    // toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Receipt{");
        sb.append("receiptName='").append(message).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
