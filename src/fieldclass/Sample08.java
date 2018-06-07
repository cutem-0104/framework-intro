package fieldclass;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Sample08 {
    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();
        Field[] declaredFields = foo.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " = " + field.get(foo));
        }
    }

    @SuppressWarnings("all")
    public static class Foo {
        private int foo = 10;
        private String bar = "str";
        private List<String> baz = new ArrayList<String>();
    }
}
