package com.lucky.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2022/5/29 14:31
 * @author: wj
 */
@RestController
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring boot " + name;
    }

}
