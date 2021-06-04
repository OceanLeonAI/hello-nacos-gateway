package com.leon.hello.nacos.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: HelloNacosProviderApplication
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:15
 * @Version 1.0
 * @DESCRIPTION: Nacos 服务提供
 **/
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class HelloNacosProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloNacosProviderApplication.class, args);
    }
}
