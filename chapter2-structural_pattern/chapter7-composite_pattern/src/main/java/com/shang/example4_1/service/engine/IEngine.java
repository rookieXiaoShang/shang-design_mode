package com.shang.example4_1.service.engine;

import com.shang.example4_1.model.aggregate.TreeRich;
import com.shang.example4_1.model.vo.EngineResult;

import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 决策引擎校验
 * @author: Shang
 * @create: 2024-12-02 16:33
 * @version: 1.0
 **/
public interface IEngine {
    EngineResult process(final Long treedId, final String userId, TreeRich treeRich, final Map<String,String> decisionMatter);
}
