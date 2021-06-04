package com.leon.hello.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: HelloGatewayApplication
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:02
 * @Version 1.0
 * @DESCRIPTION:
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class HelloGatewayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloGatewayApplication.class).run(args);
    }
}
