package com.qinghua.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication  // 所有springboot应用的主入口程序必须使用 @SpringBootApplication 注解进行标注
public class Myapplication {
    // 主入口，运行main方法就是启动服务器
    public static void main(String[] args) {
        SpringApplication.run(Myapplication.class, args);
    }
}
