package com.qinghua.springboot.service.impl;

import com.qinghua.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save(Long id, String name) {
        System.out.println("保存用户信息：" + name);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("根据ID删除用户信息：" + id);
    }
}
