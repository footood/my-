package cn.tedu.utli;

/**
 * @author: 向双
 * @date: 2021年04月23日 15时34分
 * @description:
 */
public class Test3 {
    public static void main(String[] args) {
    Person x =Person.show();
        System.out.println(x);

    }
}
class Person{
    private Person(){}
    static private Person p = new Person();
    static public Person show(){
        return p;
    }

}