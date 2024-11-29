package com.qinghua.ssm.service;

import com.qinghua.ssm.bean.Vip;

public interface VipService {

    /**
     * 根据会员的卡号查询会员信息
     *
     * @param cardNo 会员卡号
     * @return 会员信息
     */
    Vip findByCardNo(String cardNo);
}
