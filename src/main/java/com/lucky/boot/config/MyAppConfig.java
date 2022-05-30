package com.lucky.boot.config;

import com.lucky.boot.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @date 2022/5/29 16:08
 * @author: wj
 */
@Configuration
public class MyAppConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyAppConfig.class);

    @Bean
    public HelloService helloService(){
        LOGGER.info("add hello service bean...");
        return new HelloService();
    }

}
