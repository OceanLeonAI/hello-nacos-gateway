package com.leon.hello.gateway.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: GatewayRouteDefinition
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:07
 * @Version 1.0
 * @DESCRIPTION: 创建路由定义模型
 **/
public class GatewayRouteDefinition {
    /**
     * 路由的Id
     */
    private String id;

    /**
     * 路由断言集合配置
     */
    private List<GatewayPredicateDefinition> predicates = new ArrayList<>();

    /**
     * 路由过滤器集合配置
     */
    private List<GatewayFilterDefinition> filters = new ArrayList<>();

    /**
     * 路由规则转发的目标uri
     */
    private String uri;

    /**
     * 路由执行的顺序
     */
    private int order = 0;
}
