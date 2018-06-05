package classclass;

import java.util.List;

public class Reflection {
    // 文字列からインスタンスを生成する
    @SuppressWarnings({"deprecation", "unchecked"})
    public static void main(String[] args) {
        String className = "java.util.ArrayList";

        Class<?> clazz;
        List<String> list = null;
        try {
            clazz = Class.forName(className);
            list = (List<String>) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println(e);
        }
        if (list == null) {
            return;
        }
        list.add("hoge");
        list.add("bar");

        for (String ele : list) {
            System.out.println(ele);
        }
    }
}
