package com.leon.hello.nacos.gateway.dynamic.route.router;

import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: DynamicRouteServiceImplByNacos
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 16:02
 * @Version 1.0
 * @DESCRIPTION:
 **/
@Component
public class DynamicRouteServiceImplByNacos {
    @Autowired
    private DynamicRouteServiceImpl dynamicRouteService;

    public DynamicRouteServiceImplByNacos() {
        dynamicRouteByNacosListener("sc-gateway", "DEFAULT_GROUP");
    }

    /**
     * 监听Nacos Server下发的动态路由配置
     *
     * @param dataId
     * @param group
     */
    public void dynamicRouteByNacosListener(String dataId, String group) {
        try {
            ConfigService configService = NacosFactory.createConfigService("127.0.0.1:8848");
            String content = configService.getConfig(dataId, group, 5000);
            System.err.println("初始化获取到路由信息为: " + content);
            configService.addListener(dataId, group, new Listener() {
                @Override
                public void receiveConfigInfo(String configInfo) {
                    RouteDefinition definition = JSON.parseObject(configInfo, RouteDefinition.class);
                    System.err.println("获取到的最新路由配置为： " + definition);
                    dynamicRouteService.update(definition);
                }
                @Override
                public Executor getExecutor() {
                    return null;
                }
            });
        } catch (NacosException e) {
            //todo 提醒:异常自行处理此处省略
        }
    }
}
