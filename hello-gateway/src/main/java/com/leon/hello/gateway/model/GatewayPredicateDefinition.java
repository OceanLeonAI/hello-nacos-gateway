package com.leon.hello.gateway.model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: GatewayPredicateDefinition
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:07
 * @Version 1.0
 * @DESCRIPTION: 创建路由断言定义模型
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
}
