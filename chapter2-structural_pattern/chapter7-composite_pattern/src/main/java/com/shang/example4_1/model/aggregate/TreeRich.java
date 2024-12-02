package com.shang.example4_1.model.aggregate;

import com.shang.example4_1.model.vo.TreeNode;
import com.shang.example4_1.model.vo.TreeRoot;

import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 决策树结点
 * @author: Shang
 * @create: 2024-12-01 21:22
 * @version: 1.0
 **/
public class TreeRich {
    private TreeRoot treeRoot;
    private Map<Long, TreeNode> treeNodeMap;

    public TreeRich() {
    }

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
