package com.shang.example4_1.model.vo;

/**
 * @program: shang-design_mode
 * @description: 决策结果
 * @author: Shang
 * @create: 2024-12-01 21:35
 * @version: 1.0
 **/
public class EngineResult {
    private Boolean isSuccess;
    private String userId;
    private Long treeId;
    private Long nodeId;
    private String nodeValue;

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

    public EngineResult(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public EngineResult() {
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }
}
