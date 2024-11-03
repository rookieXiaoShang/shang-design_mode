package com.shang.example3_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 创建汽车工厂的逻辑类
 * @author: Shang
 * @create: 2024-10-30 16:13
 * @version: 1.0
 **/
public class CarFactoryMap {
    private static Map<Integer, CarFactory> map = new HashMap<>();
    static {
        map.put(1,new BYaDIFactory());
        map.put(2,new TeSiLaFactory());
    }

    // 根据类型创建工厂的方法
    public static CarFactory createFactory(Integer type){
        // 可以写完整的判断逻辑
        if(map.containsKey(type)){
            return map.get(type);
        }else {
            throw new RuntimeException("不存在此类型的工厂，无法生产该工厂！！！");
        }
    }

}
