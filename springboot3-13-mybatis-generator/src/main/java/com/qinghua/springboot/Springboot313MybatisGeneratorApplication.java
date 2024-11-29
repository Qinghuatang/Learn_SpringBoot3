package com.qinghua.springboot;

import com.qinghua.springboot.bean.Vip;
import com.qinghua.springboot.repository.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// 注意，使用 free mybatis tools 插件 生成Mapper类和xml文件后，还需要在启动类上添加@MapperScan注解
// 并且在application.properties中配置数据源和mybatis
@MapperScan(basePackages = "com.qinghua.springboot.repository")
@SpringBootApplication
public class Springboot313MybatisGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot313MybatisGeneratorApplication.class, args);

		VipMapper vipMapper = applicationContext.getBean(VipMapper.class);

		Vip vip = new Vip("zhangsan", "123456", "2020-01-01");
		vipMapper.insert(vip);

		System.out.println(vipMapper.selectByPrimaryKey(1L));
		applicationContext.close();
	}

}
