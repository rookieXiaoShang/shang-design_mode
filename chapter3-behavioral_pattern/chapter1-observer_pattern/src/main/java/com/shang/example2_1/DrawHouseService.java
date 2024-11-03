package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 摇号服务
 * @author: Shang
 * @create: 2024-10-31 20:20
 * @version: 1.0
 **/
public class DrawHouseService {

    //摇号抽签
    public String lots(String uId){
        if(uId.hashCode() % 2 == 0){
            return "恭喜ID为: " + uId + " 的用户,在本次摇号中中签! !";
        }else{
            return "很遗憾,ID为: " + uId + "的用户,您本次未中签! !";
        }
    }
}
