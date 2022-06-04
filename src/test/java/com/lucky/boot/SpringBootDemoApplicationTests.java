package com.lucky.boot;

import com.lucky.boot.bean.Person;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootDemoApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    Person person;

    @Autowired
    ApplicationContext context;

    @Test
    void test_logger() {
       logger.trace("this is trace log...");
       logger.debug("this is debug log...");
       logger.info("this is info log...");
       logger.warn("this is warn log...");
       logger.error("this is error log...");
    }

    @Test
    void test_helloService() {
        System.out.println(context.containsBean("helloService"));
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
