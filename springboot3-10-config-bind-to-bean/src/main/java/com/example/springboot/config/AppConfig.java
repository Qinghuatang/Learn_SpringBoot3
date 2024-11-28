package com.example.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration  // 纳入IoC容器的管理
@ConfigurationProperties(prefix = "myapp")  // 将配置文件中的属性一次性地绑定到bean对象的属性上
public class AppConfig {
    // 强调：要实现这种一次性的绑定功能，属性名必须和配置文件中的属性名一致
    private String username;
    private String password;
    private Integer age;
    private Boolean gender;

    // 底层在实现给对象赋值的时候，调用了setter方法，因此必须保证每个属性都有setter方法
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
