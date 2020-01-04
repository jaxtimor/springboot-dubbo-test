package com.example.demo.controller;

import com.example.demo.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @Autowired
    UserService userService;
    @RequestMapping("/hello")
    public Object hello(){
        return userService.hello();
    }

    @RequestMapping("/info")
    public Object info(@RequestBody Map<String, Object> params){
        return userService.info(params);

    }
}
