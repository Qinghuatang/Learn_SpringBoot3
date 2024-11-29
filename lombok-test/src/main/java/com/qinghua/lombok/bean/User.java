package com.qinghua.lombok.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  // 无参构造器
@AllArgsConstructor // 全参构造器
public class User {
    private Long id;
    private String name;
    private Integer age;
}
