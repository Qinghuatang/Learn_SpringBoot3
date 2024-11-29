package com.qinghua.lombok.test;

import com.qinghua.lombok.bean.Person;

public class PersonTest {
    public static void main(String[] args) {
          // 创建Person对象
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(18);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person);

        // 测试@EqualsAndHashCode
        Person person1 = new Person();
        person1.setName("zhangsan");
        person1.setAge(18);
        System.out.println(person.equals(person1));

        // 测试@AllArgsConstructor
        Person person2 = new Person("zhangsan", 18);
        System.out.println(person2);
    }
}
