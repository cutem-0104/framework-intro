package methodclass;

import java.lang.reflect.Method;

public class Sample06 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        // 引数で指定したメソッドを実行
        String methodName0 = args[0];
        String methodName1 = args[2];
        String methodName2 = args[4];
        String fooValue = args[1];
        String barValue = args[3];
        String bazValue = args[5];

        FooForm form = FooForm.class.newInstance();
        Method method = FooForm.class.getMethod(methodName0, String.class);
        method.invoke(form, fooValue);
        System.out.println(form);

        method = FooForm.class.getMethod(methodName1, String.class);
        method.invoke(form, barValue);
        System.out.println(form);

        method = FooForm.class.getMethod(methodName2, String.class);
        method.invoke(form, bazValue);
        System.out.println(form);

        // methodName2の引数の型
        System.out.println(method.getParameterTypes()[0].getName());

        // methodName2が宣言されている型
        Class<?> clazz = method.getDeclaringClass();
        System.out.println(clazz.getName());

        // getFooの戻り値の型
        method = FooForm.class.getMethod("getFoo");
        System.out.println(method.getReturnType().getName());

    }

    @SuppressWarnings({"unused","all"})
    public static class FooForm {
        private String foo;
        private String bar;
        private String baz;

        public String getFoo() {
            return foo;
        }

        public void setFoo(String foo) {
            this.foo = foo;
        }

        public String getBar() {
            return bar;
        }

        public void setBar(String bar) {
            this.bar = bar;
        }

        public String getBaz() {
            return baz;
        }

        public void setBaz(String baz) {
            this.baz = baz;
        }

        @Override
        public String toString() {
            return foo + " " + bar + " " + baz;
        }
    }

}
