package cn.tedu.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author: 向双
 * @date: 2021年04月26日 14时43分
 * @description:
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        // method();
        method2();

    }

    private static void method2() throws Exception {
        Class c = Human.class;
        Field[] m = c.getDeclaredFields();
        for (Field f : m) {
            System.out.println(f.getName());
            if (f.getName().equals("name")) {
                Object o = c.newInstance();
                f.set(o, "可以");
                System.out.println(f.get(o));
            }
            if (f.getName().equals("age")) {
                Object o = c.newInstance();
                f.setAccessible(true);
                f.set(o, 666);
                System.out.println(f.get(o));
            }

        }

    }

    private static void method() throws Exception {
        Class<Human> c = Human.class;
        Method[] a = c.getDeclaredMethods();
        for (Method m : a) {
            //System.out.println(m.getName());
            Object obj = c.newInstance();
            if (m.getName().equals("test1")) {
                m.invoke(obj);
            }
            if (m.getName().equals("test2")) {
                m.setAccessible(true);
                m.invoke(obj, "私有的");
            }


        }
    }
}
