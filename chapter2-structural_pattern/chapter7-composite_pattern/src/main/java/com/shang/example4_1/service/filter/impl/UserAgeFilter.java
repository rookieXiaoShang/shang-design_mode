package com.shang.example4_1.service.filter.impl;

import com.shang.example4_1.service.filter.BaseLogic;

import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 年龄规则过滤
 * @author: Shang
 * @create: 2024-12-02 16:30
 * @version: 1.0
 **/
public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
