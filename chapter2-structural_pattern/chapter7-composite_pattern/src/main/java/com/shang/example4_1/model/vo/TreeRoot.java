package com.shang.example4_1.model.vo;

/**
 * @program: shang-design_mode
 * @description: 根节点
 * @author: Shang
 * @create: 2024-12-01 21:20
 * @version: 1.0
 **/
public class TreeRoot {
    private Long treeId; // 决策树ID
    private Long treeRootNodeId; // 根节点ID
    private String treeName;

    public TreeRoot() {
    }

    public TreeRoot(Long treeId, Long treeRootNodeId, String treeName) {
        this.treeId = treeId;
        this.treeRootNodeId = treeRootNodeId;
        this.treeName = treeName;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeRootNodeId() {
        return treeRootNodeId;
    }

    public void setTreeRootNodeId(Long treeRootNodeId) {
        this.treeRootNodeId = treeRootNodeId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
