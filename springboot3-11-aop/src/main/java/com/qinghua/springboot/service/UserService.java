package com.qinghua.springboot.service;

public interface UserService {

    /**
     * 保存用户信息
     *
     * @param id   用户ID
     * @param name 用户名称
     */
    void save(Long id, String name);

    /**
     * 根据ID删除用户信息
     *
     * @param id 用户ID
     */
    void deleteById(Long id);
}
