package cn.tedu.utli;

import java.lang.annotation.Retention;

/**
 * @author: 向双
 * @date: 2021年04月23日 16时27分
 * @description:
 */
public class Test4 {
    public static void main(String[] args) {
Student a = Student.get();
Student b = Student.get();
        System.out.println(a==b);
    }
}
class Student{
  private Student(){}
   static private Student s;
    synchronized static public Student get() {
        if (s==null) {
            s = new Student();
        }
        return s;
    }
}
