package cn.tedu.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @author: 向双
 * @date: 2021年04月26日 11时47分
 * @description:
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        Class c = Demo.class;
        Method[] a = c.getMethods();
        for (Method m : a) {
            //System.out.println(m.getName());
            Controller con = m.getAnnotation(Controller.class);
            //System.out.println(con);
            if (con != null) {
                Object obj = c.newInstance();
                m.invoke(obj);
            }
        }

    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Controller {

    }

    static class Demo {
        @Controller
        public void method() {
            System.out.println(123);
        }

        String name = "jack";

        public void m() {
            System.out.println(456);
        }
    }
}

