package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com")    // 将扫描包的范围设定为从com包下开始

//@SpringBootApplication(scanBasePackages = "com")    // 将扫描包的范围设定为从com包下开始
public class Springboot315AutoConfigurationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot315AutoConfigurationApplication.class, args);

        // 从IoC容器中查看有多少个组件，将组件的id打印出来
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for (String allBeanName : allBeanNames) {
            // System.out.println(allBeanName);
            if (allBeanName.equals("appBean")) {
                System.out.println(allBeanName);
            }
        }

        applicationContext.close();
    }
}