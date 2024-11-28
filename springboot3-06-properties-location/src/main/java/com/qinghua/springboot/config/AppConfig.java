package com.qinghua.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration  // 使用这个也可以纳入IoC容器的管理，并且表示以下的类是一个配置类
 @Component  // 纳入IoC容器的管理
public class AppConfig {

    @Value("${myapp.path}")
    private String appPath;

    public void printInfo() {
        System.out.println("appPath: " + appPath);
    }
}
