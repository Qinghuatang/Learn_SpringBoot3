package com.example.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app2.abc")
public class AppBean {
    // 数组，数组中元素是简单类型
    private String[] names;

    // 数组，数组中元素是bean
    private Address[] addrArray;

    // List集合，集合中的元素是bean
    List<Address> addressList;

    // Map集合：String, Bean
    private Map<String, Address> addressMap;

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setAddrArray(Address[] addrArray) {
        this.addrArray = addrArray;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public void setAddressMap(Map<String, Address> addressMap) {
        this.addressMap = addressMap;
    }

    @Override
    public String toString() {
        return "AppBean{" +
                "names=" + Arrays.toString(names) +
                ", addrArray=" + Arrays.toString(addrArray) +
                ", addressList=" + addressList +
                ", addressMap=" + addressMap +
                '}';
    }
}
