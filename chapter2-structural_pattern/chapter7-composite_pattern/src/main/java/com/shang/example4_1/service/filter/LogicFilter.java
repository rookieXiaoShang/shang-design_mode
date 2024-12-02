package com.shang.example4_1.service.filter;

import com.shang.example4_1.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 规则过滤抽象接口
 * @author: Shang
 * @create: 2024-12-02 16:14
 * @version: 1.0
 **/
public interface LogicFilter {
    /**
     * 获取物料信息值
     * @param decisionMatter
     * @return
     */
    String matterValue(Map<String,String> decisionMatter);

    /**
     * 根据链路信息和物料信息值决定决策树方向
     * @param matterValue
     * @param treeNodeLineInfoList
     * @return
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);
}
