package classclass;

import java.lang.reflect.Constructor;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Sample04 {
    @SuppressWarnings("all")
    public static void main(String[] args)
        throws SecurityException, NoSuchMethodException {
        Class<Calendar> clazz = Calendar.class;
        Constructor<?>[] constructors = clazz.getConstructors();
        // クラスのコンストラクターを取得
        System.out.println("public constructors : " + constructors.length);

        Constructor<Calendar> constructor = clazz.getDeclaredConstructor(TimeZone.class, Locale.class);
        System.out.println(constructor);

        try {
            constructor = clazz.getDeclaredConstructor(byte.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
