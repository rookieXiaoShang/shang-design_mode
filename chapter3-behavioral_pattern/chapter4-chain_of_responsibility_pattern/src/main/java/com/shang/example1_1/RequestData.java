package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 请求信息
 * @author: Shang
 * @create: 2024-11-01 20:25
 * @version: 1.0
 **/
public class RequestData {
    private String message;

    public RequestData(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RequestData{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
