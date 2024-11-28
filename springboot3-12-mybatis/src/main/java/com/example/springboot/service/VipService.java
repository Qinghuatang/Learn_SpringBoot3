package com.example.springboot.service;

import com.example.springboot.bean.Vip;

import java.util.List;

public interface VipService {

    /**
     * 保存会员信息
     *
     * @param vip 会员信息
     * @return true表示保存成功
     */
    boolean save(Vip vip);

    /**
     * 查看会员列表
     *
     * @return 会员列表
     */
    List<Vip> findAll();

}
