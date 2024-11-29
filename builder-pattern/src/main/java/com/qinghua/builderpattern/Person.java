package com.qinghua.builderpattern;

// 建造模式，23种设计模式之一
public class Person {
    // 一般建造模式的bean属性使用final修饰
    private final String name;
    private final int age;

    // 提供一个私有的全参数构造方法
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 通过这个公开的静态方法获取建造器对象
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    // 静态内部类，用于构建Person对象
    public static class PersonBuilder {
        private String name;
        private int age;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, age);
        }
    }
}
