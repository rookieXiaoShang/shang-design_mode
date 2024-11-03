package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 审核信息
 * @author: Shang
 * @create: 2024-11-02 16:01
 * @version: 1.0
 **/
public class AuthInfo {
    private String code;
    private String info = "";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for(String info : infos){
            this.info = this.info.concat(info);
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AuthInfo{");
        sb.append("code='").append(code).append('\'');
        sb.append(", info='").append(info).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
