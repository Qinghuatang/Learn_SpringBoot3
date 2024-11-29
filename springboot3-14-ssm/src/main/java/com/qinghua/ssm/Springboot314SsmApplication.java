package com.qinghua.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages = "com.qinghua.ssm.repository")
@SpringBootApplication
public class Springboot314SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot314SsmApplication.class, args);
		// 启动后访问：http://localhost:8080/detail?cardNo=654321
		// 显示{
		//    "id": 2,
		//    "name": "李四",
		//    "cardNumber": "654321",
		//    "birth": "1991-01-01"
		//}
	}

}
