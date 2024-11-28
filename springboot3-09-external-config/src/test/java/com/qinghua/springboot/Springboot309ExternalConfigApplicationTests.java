package com.qinghua.springboot;

import com.qinghua.springboot.config.AppConfig;
import com.qinghua.springboot.config.ProfilesActiveConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot309ExternalConfigApplicationTests {

	@Autowired
	private AppConfig appConfig;

	@Autowired
	private ProfilesActiveConfig profilesActiveConfig;

	@Test
	void test() {
		appConfig.printInfo();

		/*mysqlUsername: root
		mysqlPassword: 789789
		redisHost: localhost
		redisPort: 6379*/
	}

	@Test
	void test2() {
		profilesActiveConfig.print();

		/*username: dev
		password: dev123
		url: jdbc:mysql://localhost:3306/dev*/
	}

}
