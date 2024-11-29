package com.qinghua.lombok.bean;

import lombok.*;

@Getter
@Setter
//@ToString
@ToString(exclude = "age")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
// 生成一个必须的构造方法，如果类中有final修饰的属性，则生成带有该实例变量的构造方法
// 如果类中没有final修饰的属性，则生成无参构造方法
//@RequiredArgsConstructor

public class Person {
    private String name;
    private int age;
    // final修饰的属性，必须在构造方法中初始化，因此不能有@NoArgsConstructor注解
    // private final String email;
}
