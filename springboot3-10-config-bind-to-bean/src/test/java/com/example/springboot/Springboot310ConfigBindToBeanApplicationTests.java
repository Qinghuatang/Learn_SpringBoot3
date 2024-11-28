package com.example.springboot;

import com.example.springboot.bean.Address;
import com.example.springboot.bean.AppBean;
import com.example.springboot.bean.Group;
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

    @Autowired
    private AppBean appBean;

    @Test
    void test03() {
        System.out.println(appBean);
        // AppBean{names=[jack, lucy], addrArray=[Address{city='beijing', street='ChaoYang'}, Address{city='shanghai', street='HuangPu'}], addressList=[Address{city='beijing_List', street='ChaoYang_List'}, Address{city='shanghai_List', street='HuangPu_List'}], addressMap={addr1=Address{city='beijing_Map', street='ChaoYang_Map'}, addr2=Address{city='shanghai_Map', street='HuangPu_Map'}}}
        // AppBean{names=[jack, tom, jerry], addrArray=[Address{city='beijing', street='chaoyang'}, Address{city='shanghai', street='pudong'}], addressList=[Address{city='guangzhou', street='tianhe'}, Address{city='shenzhen', street='nanshan'}], addressMap={addr1=Address{city='chengdu', street='jinjiang'}, addr2=Address{city='chongqing', street='jiangbei'}}}
    }

    @Autowired
    private Address address;

    @Test
    void test04() {
        System.out.println(address);
        // Address{city='shanghai', street='pudong'}
    }

    @Autowired
    private Group group;

    @Test
    void test05(){
        System.out.println(group);  // Group{name='IT', leader='LaoDu', count=20}

    }

}
