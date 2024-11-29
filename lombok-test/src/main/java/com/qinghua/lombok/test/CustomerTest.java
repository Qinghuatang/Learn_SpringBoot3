package com.qinghua.lombok.test;

import com.qinghua.lombok.bean.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        // 创建Customer对象
        Customer customer = new Customer("zhangsan", 18);
        System.out.println(customer.getName());
        System.out.println(customer.getAge());
        System.out.println(customer);
    }
}
