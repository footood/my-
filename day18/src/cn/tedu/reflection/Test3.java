package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author: 向双
 * @date: 2021年04月25日 11时46分
 * @description:
 */
public class Test3 {
    public static void main(String[] args) throws  Exception{
        //method();
       //method2();
        // method3();
       // method4();
        method5();
    }

    private static void method5() throws Exception{
       Class c = Class.forName("cn.tedu.reflection.Person");
        Field[] fs = c.getFields();
        for (Field f:fs) {
            System.out.println(f.getName());
            System.out.println(f.getType().getName());
        }
    }

    private static void method4() {
        Class c = Person.class;
        Method[] ms = c.getMethods();
        for (Method m:ms) {
            System.out.println(m.getName());
            Class[] cc = m.getParameterTypes();
            System.out.println(Arrays.toString(cc));
        }

    }

    private static void method3() {
        Class c = Person.class;
        Constructor[] cs = c.getConstructors();
        for (Constructor co : cs) {
            System.out.println(co.getName());
            Class[] cs2 = co.getParameterTypes();
            System.out.println(Arrays.toString(cs2));
        }
    }

    private static void method2() {
    }
    private static void method() throws Exception {
       Class c1 = Class.forName("cn.tedu.reflection.Person");
       Class<String> c2 = String.class;
       Class c3 = new Person().getClass();

    }
}
