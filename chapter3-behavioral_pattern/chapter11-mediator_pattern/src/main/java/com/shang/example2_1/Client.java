package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-03 20:50
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        BeiKeLease lease = new BeiKeLease();

        Landlord landlord = new Landlord("路飞",lease);
        Renter renter = new Renter("娜美",lease);

        lease.setHouseOwner(landlord);
        lease.setTenant(renter);

        // 设置租房信息
        renter.contact("需要一个两室一厅的房子,一家人住");
        landlord.contact("出租一套两室一厅带电梯,月租5000");
    }
}
