package com.shang.example2_2;

import com.shang.example2_1.ReceiptType;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 回执创造工厂
 * @author: Shang
 * @create: 2024-11-01 11:02
 * @version: 1.0
 **/
// 回执工厂是为了解决在strategy中还要使用if else判断receipt是否使用对了对象
public class ReceiptFactory {
    private static Map<Enum<ReceiptType>,IReceiptStrategy> strategyMap;
    private ReceiptFactory() {
        throw new RuntimeException("No instances Allowed!!!");
    }
    // 调用该方法在实现初始化 否则太消耗内存了
    public static void init() {
        strategyMap = new HashMap<>();
        strategyMap.put(ReceiptType.MT1101,new ReceiptStrategyA());
        strategyMap.put(ReceiptType.MT2101,new ReceiptStrategyB());
        strategyMap.put(ReceiptType.MT4101,new ReceiptStrategyC());
        strategyMap.put(ReceiptType.MT8104,new ReceiptStrategyD());
    }
    // 策略工厂最终就是要生产出来策略
    public static IReceiptStrategy getStrategy(Enum<ReceiptType> type) {
        return strategyMap.get(type);
    }
}
