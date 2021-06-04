package com.leon.hello.nacos.gateway.dynamic.route;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: HelloNacosGatewayDynamicRouteApplication
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 15:14
 * @Version 1.0
 * @DESCRIPTION: 动态路由
 **/
@SpringCloudApplication
public class HelloNacosGatewayDynamicRouteApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloNacosGatewayDynamicRouteApplication.class).run(args);
    }
}
