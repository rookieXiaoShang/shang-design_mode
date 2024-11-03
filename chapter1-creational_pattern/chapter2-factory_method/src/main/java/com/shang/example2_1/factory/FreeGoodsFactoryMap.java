package com.shang.example2_1.factory;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 创建工厂的类
 * @author: Shang
 * @create: 2024-10-29 11:43
 * @version: 1.0
 **/
public class FreeGoodsFactoryMap {
    private static final Map<Integer, IFreeGoodsFactory> cachedFactories = new HashMap<>();
    // 提前将工厂类封装 有点单例模式的意思 只需要一个创建工厂的类即可
    static {
        cachedFactories.put(1, new CardFactory());
        cachedFactories.put(2, new CouponFactory());
        cachedFactories.put(3, new GoodFactory());
    }
    public static IFreeGoodsFactory getParserFactory(Integer type){
        if(type == 1){
            IFreeGoodsFactory freeGoodsFactory = cachedFactories.get(1);
            return freeGoodsFactory;
        }else if(type ==2){
            IFreeGoodsFactory freeGoodsFactory = cachedFactories.get(2);
            return freeGoodsFactory;
        }else if(type ==3){
            IFreeGoodsFactory freeGoodsFactory = cachedFactories.get(3);
            return freeGoodsFactory;
        }else {
            throw new RuntimeException("商品类型类型错误！！！");
        }
    }
}
