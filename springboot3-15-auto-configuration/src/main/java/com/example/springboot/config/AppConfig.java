package com.example.springboot.config;

import com.example.springboot.bean.A;
import com.example.springboot.bean.B;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 当类路径下存在DispatcherServlet类时，配置生效
@ConditionalOnClass(name = {"org.springframework.web.servlet.DispatcherServlet"})
@Configuration
public class AppConfig {

    /*@Bean
    public A a() {
        return new A();
    }*/

/*    // @ConditionalOnBean(A.class) // 当IoC容器中存在A类型的Bean对象时，才会实例化B组件
    @ConditionalOnMissingBean(A.class) // 当IoC容器中不存在A类型的Bean对象时，才会实例化B组件
    @Bean
    public B b() {
        return new B();
    }*/

    @Bean
    public A test1(){
        return new A();
    }

    @Bean
    public B test2(){
        return new B();
    }
}
