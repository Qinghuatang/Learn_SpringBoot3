package other;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Builder    // 帮助这个类生成符合构造者模式的代码
@Data
public class Person {
    private String name;
    private int age;

    @Singular("addPhone")
    private List<String> phones;
}
