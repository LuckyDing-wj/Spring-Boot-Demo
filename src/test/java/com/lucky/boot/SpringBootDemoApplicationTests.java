package com.lucky.boot;

import com.lucky.boot.bean.Person;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext context;

    @Test
    void test_helloService() {
        System.out.println(context.containsBean("helloService"));
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
