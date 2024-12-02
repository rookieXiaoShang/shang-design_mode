package com.shang.example4_1.model.vo;

/**
 * @program: shang-design_mode
 * @description: 链路节点
 * @author: Shang
 * @create: 2024-12-01 21:21
 * @version: 1.0
 **/
public class TreeNodeLink {
    private Long nodeIdFrom;
    private Long nodeIdTo;
    private Integer ruleLimitType;
    private String ruleLimitValue;

    public TreeNodeLink() {
    }

    public TreeNodeLink(Long nodeIdFrom, Long nodeIdTo, Integer ruleLimitType, String ruleLimitValue) {
        this.nodeIdFrom = nodeIdFrom;
        this.nodeIdTo = nodeIdTo;
        this.ruleLimitType = ruleLimitType;
        this.ruleLimitValue = ruleLimitValue;
    }

    public Long getNodeIdFrom() {
        return nodeIdFrom;
    }

    public void setNodeIdFrom(Long nodeIdFrom) {
        this.nodeIdFrom = nodeIdFrom;
    }

    public Long getNodeIdTo() {
        return nodeIdTo;
    }

    public void setNodeIdTo(Long nodeIdTo) {
        this.nodeIdTo = nodeIdTo;
    }

    public Integer getRuleLimitType() {
        return ruleLimitType;
    }

    public void setRuleLimitType(Integer ruleLimitType) {
        this.ruleLimitType = ruleLimitType;
    }

    public String getRuleLimitValue() {
        return ruleLimitValue;
    }

    public void setRuleLimitValue(String ruleLimitValue) {
        this.ruleLimitValue = ruleLimitValue;
    }
}
