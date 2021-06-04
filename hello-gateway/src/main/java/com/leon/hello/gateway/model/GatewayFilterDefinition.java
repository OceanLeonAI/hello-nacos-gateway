package com.leon.hello.gateway.model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: GatewayFilterDefinition
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:06
 * @Version 1.0
 * @DESCRIPTION: 路由过滤器定义模型
 **/
public class GatewayFilterDefinition {
    /**
     * Filter Name
     */
    private String name;

    /**
     * 对应的路由规则
     */
    private Map<String, String> args = new LinkedHashMap<>();
}
