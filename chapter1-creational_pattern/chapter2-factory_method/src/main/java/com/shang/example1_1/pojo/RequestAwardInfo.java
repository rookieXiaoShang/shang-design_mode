package com.shang.example1_1.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 接收货物信息
 * @author: Shang
 * @create: 2024-10-29 10:17
 * @version: 1.0
 **/
public class RequestAwardInfo {

    private String sku;                   // 商品sku
    private String consigneeUserName;     // 收货人姓名
    /*
            private String orderId;               // 订单ID
            private String consigneeUserPhone;    // 收货人手机
            private String consigneeUserAddress;  // 收获人地址
            private String userName;              // 用户姓名
            private String userPhone;             // 用户手机
    */
    private Map<String,String> exrInfo =  new HashMap<String,String>();

    public RequestAwardInfo(String sku, String consigneeUserName) {
        this.sku = sku;
        this.consigneeUserName = consigneeUserName;
    }

    public String getUserName() {
        return exrInfo.get("userName");
    }

    public String getUserPhone() {
        return exrInfo.get("userPhone");
    }

    public String getSku() {
        return sku;
    }

    public String getOrderId() {
        return exrInfo.get("orderId");
    }

    public String getConsigneeUserName() {
        return consigneeUserName;
    }

    public String getConsigneeUserPhone() {
        return exrInfo.get("consigneeUserPhone");
    }

    public String getConsigneeUserAddress() {
        return exrInfo.get("consigneeUserAddress");
    }
    public void setExrInfo(Map<String,String> exrInfo) {
        this.exrInfo = exrInfo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AwardInfo{");
        sb.append("sku='").append(sku).append('\'');
        sb.append(", consigneeUserName='").append(consigneeUserName).append('\'');
        sb.append(", exrInfo=").append(exrInfo);
        sb.append('}');
        return sb.toString();
    }
}
