package com.qinghua.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfilesActiveConfig {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    public void print() {
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("url: " + url);
    }
}
