package com.qinghua.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SystemService {
    @Value("${myapp.username}")
    private String username;

    @Value("${myapp.email}")
    private String email;

    // 注意：当使用 @Value注解的时候，如果key不存在并且没有指定默认值，会报错
    // @Value("${myapp.age}")
    @Value("${myapp.age:20}")
    private Integer age;

    public void printInfo(){
        System.out.println("username: " + username);
        System.out.println("email: " + email);
        System.out.println("age: " + age);
    }

}
