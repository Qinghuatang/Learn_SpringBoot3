package com.example.springboot;

import com.example.springboot.bean.Vip;
import com.example.springboot.service.VipService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


//@MapperScan(basePackages = "com.example.springboot.repository")	// 通过这个注解指定去哪里找mapper接口
@SpringBootApplication
public class Springboot312MybatisApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot312MybatisApplication.class, args);

		// 获取service对象
		VipService vipService = applicationContext.getBean(VipService.class);

		/*vipService.save(new Vip( "张三", "123456", "1990-01-01"));
		vipService.save(new Vip( "李四", "654321", "1991-01-01"));
		vipService.save(new Vip( "王五", "111111", "1992-01-01"));*/

		// 查看会员列表
		vipService.findAll().forEach(System.out::println);

		applicationContext.close();
	}

}
