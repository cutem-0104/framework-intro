package classclass;

import java.lang.reflect.Field;

public class Sample03 {
    public static void main(String[] args)
            throws SecurityException, NoSuchFieldException {
        Class<System> clazz = System.class;

        // クラスのメソッドを取得
        Field field = clazz.getField("out");
        System.out.println(field);

        try {
            String safe = "safe";
            field = clazz.getField(safe);
            System.out.println(field);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
