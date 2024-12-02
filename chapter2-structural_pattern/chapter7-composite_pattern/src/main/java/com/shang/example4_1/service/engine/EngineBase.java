package com.shang.example4_1.service.engine;

import com.shang.example4_1.service.filter.LogicFilter;
import com.shang.example4_1.model.aggregate.TreeRich;
import com.shang.example4_1.model.vo.EngineResult;
import com.shang.example4_1.model.vo.TreeNode;
import com.shang.example4_1.model.vo.TreeRoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 基础规则引擎类
 * @author: Shang
 * @create: 2024-12-02 16:39
 * @version: 1.0
 **/
public abstract class EngineBase extends EngineConfig implements IEngine{
    private Logger logger = LoggerFactory.getLogger(EngineBase.class);
    // 默认引擎处理中实现
    public abstract EngineResult process(Long treedId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);
    // 获取最终的果实Node
    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter){
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根Id
        Long treeRootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(treeRootNodeId);
        // 1 是子叶 2 是果实
        while (treeNodeInfo.getNodeType().equals(1)){
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterGroup.get(ruleKey);
            String userInfo = logicFilter.matterValue(decisionMatter);
            Long nextNodeId = logicFilter.filter(userInfo, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNodeId);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, userInfo);
        }
        return treeNodeInfo;
    }
}
