package com.shang.example4_1.service.engine.impl;

import com.shang.example4_1.model.aggregate.TreeRich;
import com.shang.example4_1.model.vo.EngineResult;
import com.shang.example4_1.model.vo.TreeNode;
import com.shang.example4_1.service.engine.EngineBase;

import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 默认规则树引擎处理类
 * @author: Shang
 * @create: 2024-12-02 16:54
 * @version: 1.0
 **/
public class TreeEngineHandler extends EngineBase {
    // 调用规则树引擎流程
    @Override
    public EngineResult process(Long treedId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        TreeNode treeNode = engineDecisionMaker(treeRich, treedId, userId, decisionMatter);
        // 封装处理结果
        Long treeNodeId = treeNode.getTreeNodeId();
        String nodeValue = treeNode.getNodeValue();
        EngineResult engineResult = new EngineResult(userId, treedId, treeNodeId, nodeValue);
        return engineResult;
    }
}
