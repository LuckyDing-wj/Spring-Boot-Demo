package com.lucky.boot.config;

import com.lucky.boot.service.HelloService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @date 2022/5/31 15:59
 * @author: wj
 */
@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloService.class);
    }
}
