package com.qinghua.lombok.test;

import com.qinghua.lombok.bean.User;

public class Test {
    public static void main(String[] args) {
        // 创建User对象
        User user = new User();
        user.setId(1L);
        user.setName("zhangsan");
        user.setAge(18);
        System.out.println(user);

        user = new User(2L, "lisi", 20);
        System.out.println(user);

        /*
        User(id=1, name=zhangsan, age=18)
        User(id=2, name=lisi, age=20)
        */

    }
}
