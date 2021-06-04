package com.leon.hello.nacos.gateway.dynamic.route.router;

import com.alibaba.nacos.api.PropertyKeyConst;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: NacosConstant
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 16:17
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class NacosConstant extends PropertyKeyConst {
    public static final String NACOS_SERVER_ADDR = "nacos.server-addr";

    public static final long DEFAULT_TIMEOUT = 30000;
}
