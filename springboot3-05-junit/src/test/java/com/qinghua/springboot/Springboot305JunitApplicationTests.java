package com.qinghua.springboot;

import com.qinghua.springboot.bean.User;
import com.qinghua.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest    // springboot项目中使用单元测试junit，必须使用 @SpringBootTest 注解进行标注
class Springboot305JunitApplicationTests {

	@Autowired
	private UserService userService;

	@Test
		// 单元测试方法 必须使用 @Test 注解进行标注
	void contextLoads() {
		User user = userService.findUser();
		System.out.println(user);
	}

}
