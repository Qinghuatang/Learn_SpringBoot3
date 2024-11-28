package com.qinghua.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Value("${spring.datasource.username}")
    private String mysqlUsername;

    @Value("${spring.datasource.password}")
    private String mysqlPassword;

    @Value("${spring.data.redis.host}")
    private String redisHost;

    @Value("${spring.data.redis.port}")
    private String redisPort;

    public void printInfo() {
        System.out.println("mysqlUsername: " + mysqlUsername);
        System.out.println("mysqlPassword: " + mysqlPassword);
        System.out.println("redisHost: " + redisHost);
        System.out.println("redisPort: " + redisPort);
    }
}
