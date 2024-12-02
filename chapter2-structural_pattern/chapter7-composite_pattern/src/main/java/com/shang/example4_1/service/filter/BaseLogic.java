package com.shang.example4_1.service.filter;

import com.shang.example4_1.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 基础过滤规则实现
 * @author: Shang
 * @create: 2024-12-02 16:20
 * @version: 1.0
 **/
public abstract class BaseLogic implements LogicFilter{
    /**
     * 具体的规则规律实现类中获取物料信息值
     * @param decisionMatter
     * @return
     */
    public abstract String matterValue(Map<String, String> decisionMatter);

    /**
     * 返回下一个节点ID
     * @param matterValue
     * @param treeNodeLineInfoList
     * @return
     */
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList) {
        // 如何返回下一个节点
        for (TreeNodeLink nodeLine : treeNodeLineInfoList) {
            if(decisionLogic(matterValue,nodeLine)) return nodeLine.getNodeIdTo();
        }
        // 可能会引发空指针
        return 0L;
    }
    private Boolean decisionLogic(String matterValue, TreeNodeLink nodeLine) {
        switch (nodeLine.getRuleLimitType()){
            case 1 -> {
                return matterValue.equals(nodeLine.getRuleLimitValue());
            }
            case 2 -> {
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLine.getRuleLimitValue());
            }
            case 3 -> {
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLine.getRuleLimitValue());
            }
            case 4 -> {
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLine.getRuleLimitValue());
            }
            case 5 -> {
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLine.getRuleLimitValue());
            }
            default -> {
                return false;
            }
        }
    }
}
