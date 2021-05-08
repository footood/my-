package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: 向双
 * @date: 2021年04月25日 15时39分
 * @description:
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
       //method();
        method2();
        //method3();
    }

    private static void method3() throws Exception{
        Class c = Person.class;
        Method m =c.getMethod("show",int.class,String.class);
        Object obj = c.newInstance();
        m.invoke(obj,10,"成功");

    }

    private static void method2() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class c = Person.class;
        Field f = c.getDeclaredField("age");
        //System.out.println(f.getType().getName());
        f = null;
        if (f != null) {
            Object obj = c.newInstance();
            f.set(obj, 10);
            System.out.println(f.get(obj));
        }
}
    private static void method() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c = Person.class;
        Object o = c.newInstance();
        System.out.println(o);

        Constructor con = c.getConstructor(String.class);
        Object o2 = con.newInstance("jack");
        System.out.println(o2);

        Person p = (Person) o2;
        p.test();
        p.show(10,"g");
    }
}