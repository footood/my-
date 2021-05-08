package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author: 向双
 * @date: 2021年04月26日 10时19分
 * @description: 测试反射
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        method1();
        method2();
        method3();
    }

    private static void method3() throws Exception {
        Class c = Human.class;
        Constructor[] cs = c.getConstructors();
        for (Constructor co : cs) {
            //System.out.println(co.getName());
            Class[] cc = co.getParameterTypes();
            if (cc.length == 0) {
                //System.out.println(co.getName());
                Object obj = co.newInstance();
                System.out.println(obj);
            }
            if (cc.length != 0) {
                Object o = co.newInstance("含参", 2000, 131);
                System.out.println(o);
            }

        }
    }

    private static void method2() throws Exception {
        Class c = Human.class;
        Method[] m = c.getMethods();
        Object obj = c.newInstance();
        for (Method a : m) {
            System.out.println(a.getName());
            if (a.getName().equals("test3")) {
                a.invoke(obj, 11);
            }
        }
    }

    private static void method1() throws InstantiationException, IllegalAccessException {
        Class c = Human.class;
        Field[] fs = c.getFields();
        Object obj = c.newInstance();
        for (Field f : fs) {
            System.out.println(f.getName());
            if (f.getName().equals("name")) {
                f.set(obj, "jack");
                System.out.println(f.get(obj));

            }
        }
    }
}
