package com.qinghua.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// 提醒: 这个HelloController要想被spring容器管理，这个类所在的位置必须满足: 和SpringBoot主入口程序在同级目录下，或者子目下。

// @Controller
@RestController // 相当于添加 @Controller注解，并且给Controller中所有的方法添加 @ResponseBody注解
public class HelloController {
    @GetMapping("/hello")
    // @ResponseBody
    public String hello() {
        return "Hello, SpringBoot3！";
    }
}
