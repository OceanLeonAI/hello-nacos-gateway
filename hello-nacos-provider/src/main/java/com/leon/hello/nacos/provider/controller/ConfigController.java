package com.leon.hello.nacos.provider.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: ConfigController
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:19
 * @Version 1.0
 * @DESCRIPTION:
 **/
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    /**
     * 首先通过调用 Nacos Open API
     * 向 Nacos Server 发布配置：dataId 为example.properties，
     * 内容为 useLocalCache=true
     */

//    @Value("${config}")
//    private String config;
//
//    @RequestMapping("/get")
//    public String get() {
//        return config;
//    }
}
