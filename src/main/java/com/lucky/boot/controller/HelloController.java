package com.lucky.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Map;


/**
 * @date 2022/5/29 14:31
 * @author: wj
 */
@Controller
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring boot " + name;
    }

    @GetMapping("/success")
    public String success(Map<String, Object> map){
        map.put("name", "ding");
        map.put("users", Arrays.asList("wang", "ding"));
        return "success";
    }

}
