package com.leon.hello.nacos.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: HelloNacosConsumerApplication
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:30
 * @Version 1.0
 * @DESCRIPTION:
 **/
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class HelloNacosConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloNacosConsumerApplication.class).run(args);
    }
}
