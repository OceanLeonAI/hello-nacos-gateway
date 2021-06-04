package com.leon.hello.gateway.model;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.AssertTrue;

/**
 * @PROJECT_NAME: hello-nacos-gateway
 * @CLASS_NAME: User
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/6/4 11:08
 * @Version 1.0
 * @DESCRIPTION:
 **/
@Data
public class User {
    /**
     * 主键
     */
    private String id;

    /**
     * 姓名
     */
    private String username;

    @AssertTrue
    public boolean ok() {
        if (StringUtils.isEmpty(username)) {
            return true;
        }
        return false;
    }
}
