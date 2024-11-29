package com.qinghua.lombok.test;

import com.qinghua.lombok.service.UserService;

public class UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.saveUser(); // [main] INFO com.qinghua.lombok.service.UserService -- save user
    }
}
