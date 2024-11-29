package com.qinghua.ssm.controller;

import com.qinghua.ssm.bean.Vip;
import com.qinghua.ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipController {

    @Autowired
    private VipService vipService;

    @GetMapping("/detail")
    public Vip detail(@RequestParam("cardNo") String cardNo) {
        return vipService.findByCardNo(cardNo);
    }
}
