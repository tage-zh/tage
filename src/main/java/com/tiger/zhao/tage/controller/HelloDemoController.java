package com.tiger.zhao.tage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloDemoController {
    @RequestMapping("/hello")
    public Map sayHello(){
        Map result = new HashMap<>();
        result.put("name","tiger docker file again");
        return result;
    }
}
