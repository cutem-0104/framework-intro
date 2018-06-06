package classclass;

import java.lang.reflect.Method;

public class Sample02 {
    public static void main(String[] args)
            throws SecurityException, NoSuchMethodException {
        Class<String> clazz = String.class;

        // クラスのメソッドを取得
        Method method = clazz.getMethod("valueOf", int.class);
        System.out.println(method);

        try {
            String valueOf = "valueOf";
            method = clazz.getMethod(valueOf, System.class);
            System.out.println(method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
