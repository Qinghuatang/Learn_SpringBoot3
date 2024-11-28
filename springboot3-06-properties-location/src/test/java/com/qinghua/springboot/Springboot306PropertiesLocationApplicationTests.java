package com.qinghua.springboot;

import com.qinghua.springboot.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot306PropertiesLocationApplicationTests {

    @Autowired
    private AppConfig appConfig;

    @Test
    void test01(){
        appConfig.printInfo();

        // 与springboot项目同级的目录下的配置文件的情况不做测试（需要打jar包）...
    }

}
