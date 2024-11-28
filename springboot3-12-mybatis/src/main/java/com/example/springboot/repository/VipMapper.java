package com.example.springboot.repository;

import com.example.springboot.bean.Vip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VipMapper {

    /**
     * 保存会员信息
     *
     * @param vip 会员信息
     * @return 1表示保存成功
     */
    int insert(Vip vip);

    /**
     * 获取所有会员信息
     *
     * @return 会员列表
     */
    List<Vip> selectAll();
}
