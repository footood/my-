package cn.tedu.reflection;

/**
 * @author: 向双
 * @date: 2021年04月25日 11时27分
 * @description: 测试反射
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
       Class c1 =Class.forName("java.lang.String");
       Class c2 = String.class;
       Class c3 = new String().getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getPackage().getName());
        System.out.println(c1.getName());
    }
}
