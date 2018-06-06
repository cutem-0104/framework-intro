package classclass;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

public class Sample05 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args)
        throws SecurityException {
        Class<Baz> clazz = Baz.class;

        // クラスのアノテーションを取得
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        Inherited annotation = clazz.getAnnotation(Inherited.class);
        System.out.println(annotation);
    }

    /**
     * @deprecated 非推奨
     */
    @Deprecated(since="9", forRemoval = true)//どのバージョンから非推奨か、将来廃止予定か
    @SuppressWarnings("all")
    public static class Baz {

    }
}
