package com.example.springboot;

import com.example.springboot.bean.User;
import com.example.springboot.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot310ConfigBindToBeanApplicationTests {

	@Autowired
	private AppConfig appConfig;

	@Test
	void test01() {
		System.out.println(appConfig);
	}

	@Autowired
	private User user;

	@Test
	void test02() {
		System.out.println(user);
	}

}
