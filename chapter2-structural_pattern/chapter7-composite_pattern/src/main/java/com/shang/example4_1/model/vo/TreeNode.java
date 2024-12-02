package com.shang.example4_1.model.vo;

import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 树节点（可能是果实结点，也可能是容器节点）
 * @author: Shang
 * @create: 2024-12-01 21:21
 * @version: 1.0
 **/
public class TreeNode {
    private Long treeId;
    private Long treeNodeId;
    private Integer nodeType;
    private String nodeValue;
    private String ruleKey;
    private String ruleDesc;
    private List<TreeNodeLink> treeNodeLinkList;

    public TreeNode() {
    }

    public TreeNode(Long treeId, Long treeNodeId, Integer nodeType, String nodeValue, String ruleKey, String ruleDesc, List<TreeNodeLink> treeNodeLinkList) {
        this.treeId = treeId;
        this.treeNodeId = treeNodeId;
        this.nodeType = nodeType;
        this.nodeValue = nodeValue;
        this.ruleKey = ruleKey;
        this.ruleDesc = ruleDesc;
        this.treeNodeLinkList = treeNodeLinkList;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public List<TreeNodeLink> getTreeNodeLinkList() {
        return treeNodeLinkList;
    }

    public void setTreeNodeLinkList(List<TreeNodeLink> treeNodeLinkList) {
        this.treeNodeLinkList = treeNodeLinkList;
    }
}
