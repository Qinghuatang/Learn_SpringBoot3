package com.qinghua.builderpattern;

public class Test {
    public static void main(String[] args) {
        Person person = Person.builder()
                                .name("张三")
                                .age(18)
                                .build();
        System.out.println(person);
    }
}
