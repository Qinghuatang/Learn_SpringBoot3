package com.qinghua.springboot;

import com.qinghua.springboot.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot309ExternalConfigApplicationTests {

	@Autowired
	private AppConfig appConfig;

	@Test
	void test() {
		appConfig.printInfo();

		/*mysqlUsername: root
		mysqlPassword: 789789
		redisHost: localhost
		redisPort: 6379*/
	}

}
