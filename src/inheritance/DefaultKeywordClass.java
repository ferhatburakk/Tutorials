package inheritance;

import java.util.Arrays;
import java.util.List;

public class DefaultKeywordClass {

    int def;

    public int getX() {
        return def;
    }

    public void setX(int def) {
        this.def = def;
    }

    public DefaultKeywordClass(int def) {
        this.def = def;
    }


    public void testProperties() {
        List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
        list.stream()
                .filter(name -> name.startsWith("f"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        Runnable runnable = () -> System.out.println("Hello world two!");
    }
}
