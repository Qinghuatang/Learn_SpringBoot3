package com.qinghua.springboot.service.impl;

import com.qinghua.springboot.bean.User;
import com.qinghua.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public User findUser() {
        return new User("zhangsan", "123456");
    }
}
