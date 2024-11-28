package com.example.springboot.config;

import com.example.springboot.bean.Address;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 指定该类是一个配置类（指定后才可以用 @Bean注解）
public class AppConfig2 {

    // 假设Address是第三方库提供的类，我们使用以下方式可以完成配置到bean的属性的绑定
    @Bean   // 纳入IoC容器的管理
    @ConfigurationProperties(prefix = "orther.abc") // 将配置文件中的orther.abc前缀的属性值绑定到Address的属性中
    public Address address() {
        return new Address();
    }

}
