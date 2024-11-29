package other;

import lombok.Builder;
import lombok.Data;

@Builder    // 帮助这个类生成符合构造者模式的代码
@Data
public class Person {
    private String name;
    private int age;
}
