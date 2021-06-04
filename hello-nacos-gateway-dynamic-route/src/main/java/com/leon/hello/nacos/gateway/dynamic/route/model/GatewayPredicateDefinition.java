package com.leon.hello.nacos.gateway.dynamic.route.model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: GatewayPredicateDefinition
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 15:59
 * @Version 1.0
 * @DESCRIPTION: 路由断言定义模型
 **/
public class GatewayPredicateDefinition {
    /**
     * 断言对应的Name
     */
    private String name;

    /**
     * 配置的断言规则
     */
    private Map<String, String> args = new LinkedHashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }
}
