package other;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*Person person = Person.builder()
                .name("李四")
                .age(20)
                .build();*/

        /*List<String> phones = new ArrayList<>();
        phones.add("123456789");
        phones.add("987654321");


        Person person = Person.builder()
                .name("李四")
                .age(20)
                .phones(phones)
                .build();*/

        Person person = Person.builder()
                .name("李四")
                .age(20)
                .addPhone("123456789")
                .addPhone("987654321")
                .build();

        System.out.println(person);
    }
}
