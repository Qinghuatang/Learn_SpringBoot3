package com.qinghua.ssm.service.impl;

import com.qinghua.ssm.bean.Vip;
import com.qinghua.ssm.repository.VipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VipServiceImpl implements com.qinghua.ssm.service.VipService {

    @Autowired
    private VipMapper vipMapper;

    public Vip findByCardNo(String cardNo) {
        return vipMapper.selectByCardNo(cardNo);
    }
}
