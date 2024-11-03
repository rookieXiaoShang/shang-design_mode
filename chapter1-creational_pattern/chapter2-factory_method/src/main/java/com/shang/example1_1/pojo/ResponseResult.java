package com.shang.example1_1.pojo;

/**
 * @program: shang-design_mode
 * @description: 响应结果
 * @author: Shang
 * @create: 2024-10-29 10:16
 * @version: 1.0
 **/
public class ResponseResult {
    private String code;
    private String message;

    public ResponseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResponseResult{");
        sb.append("code='").append(code).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
