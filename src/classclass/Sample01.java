package classclass;

import java.lang.reflect.Method;

public class Sample01 {
    public static void main(String[] args) {
        Class<String> clazz = String.class;

        // Stringクラスのpublicメソッドをすべて取得
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
