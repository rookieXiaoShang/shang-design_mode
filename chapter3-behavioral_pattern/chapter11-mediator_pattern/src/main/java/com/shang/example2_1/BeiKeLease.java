package com.shang.example2_1;


/**
 * @program: shang-design_mode
 * @description: 贝壳租房机构
 * @author: Shang
 * @create: 2024-11-03 20:37
 * @version: 1.0
 **/
public class BeiKeLease implements IMediator{
    //中介要知晓房主和租房者的信息
    private Landlord houseOwner;
    private Renter tenant;

    public Landlord getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(Landlord houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Renter getTenant() {
        return tenant;
    }

    public void setTenant(Renter tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, IPerson person) {
        System.out.println("欢迎来到贝壳找房！！！");
        if(person == houseOwner){  //如果是房主,则租房者获得信息
            tenant.getMessage(message);
        }else { //如果是租房者则获取房主信息
            houseOwner.getMessage(message);
        }
    }
}
