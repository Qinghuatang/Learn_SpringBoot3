package com.example.springboot;

import com.example.springboot.service.SystemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot308YmlApplicationTests {

	@Autowired
	private SystemService systemService;

	@Test
	void test01() {
		systemService.print();
	}

}
