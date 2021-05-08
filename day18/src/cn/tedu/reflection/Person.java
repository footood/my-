package cn.tedu.reflection;

/**
 * @author: 向双
 * @date: 2021年04月25日 11时46分
 * @description:
 */
public class Person {
    public static void main(String[] args) {
    }
       public String name;
        int age;
    public Person() { }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(int a,String b){
        System.out.println(a+""+b);
        }
    public void test() { }
    public Person(int age){}
    public Person(String name){}
}

