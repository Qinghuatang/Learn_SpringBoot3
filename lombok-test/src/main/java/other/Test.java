package other;

public class Test {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("李四")
                .age(20)
                .build();
        System.out.println(person);
    }
}
