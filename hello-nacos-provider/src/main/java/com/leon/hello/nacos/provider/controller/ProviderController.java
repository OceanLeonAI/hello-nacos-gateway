package com.leon.hello.nacos.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: ProviderController
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:17
 * @Version 1.0
 * @DESCRIPTION:
 **/
@RestController
@RequestMapping("/provider")
@Slf4j
public class ProviderController {
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        log.info("I'm calling nacos-provider service by dynamic gateway...");
        return name + " Hi~, I'm from nacos-provider";
    }
}
