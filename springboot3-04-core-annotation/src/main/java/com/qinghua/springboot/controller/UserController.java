package com.qinghua.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired  // 从Spring的IoC容器中查找Date对象，注入到这里
    private Date date;

    @GetMapping("/hello")
    private String hello(){
        return date.toString();
    }
}
