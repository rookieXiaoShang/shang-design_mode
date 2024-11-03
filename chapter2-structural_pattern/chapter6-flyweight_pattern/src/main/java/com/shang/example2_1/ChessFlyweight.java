package com.shang.example2_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 棋子享原池
 * @author: Shang
 * @create: 2024-10-31 15:30
 * @version: 1.0
 **/
public class ChessFlyweight {
    // 初始化享原池
    private static Map<String,IChess> chessMap;
    private ChessFlyweight() {
        chessMap = new HashMap<>();
        chessMap.put("b",new BlackChess());
        chessMap.put("w",new WhiteChess());
    }
    // 设置为单例模式
    private static final ChessFlyweight chessFlyweight = new ChessFlyweight();

    public static ChessFlyweight getChessFlyweight() {
        return chessFlyweight;
    }

    // 获取享原对象
    public IChess getChess(String key) {
        if(chessMap.containsKey(key)) {
            return chessMap.get(key);
        }else {
            throw new RuntimeException("享原对象获取错误！！！");
        }
    }
}
