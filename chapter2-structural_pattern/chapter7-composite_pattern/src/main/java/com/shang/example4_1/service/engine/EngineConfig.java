package com.shang.example4_1.service.engine;

import com.shang.example4_1.service.filter.LogicFilter;
import com.shang.example4_1.service.filter.impl.UserAgeFilter;
import com.shang.example4_1.service.filter.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: shang-design_mode
 * @description: 引擎配置，相当于规则工厂
 * @author: Shang
 * @create: 2024-12-02 16:36
 * @version: 1.0
 **/
public class EngineConfig {
    protected static Map<String, LogicFilter> logicFilterGroup;
    static {
        logicFilterGroup = new ConcurrentHashMap<>();
        logicFilterGroup.put("userAge",new UserAgeFilter());
        logicFilterGroup.put("userGender",new UserGenderFilter());
    }

    public static Map<String, LogicFilter> getLogicFilterGroup() {
        return logicFilterGroup;
    }

    public static void setLogicFilterGroup(Map<String, LogicFilter> logicFilterGroup) {
        EngineConfig.logicFilterGroup = logicFilterGroup;
    }
}
