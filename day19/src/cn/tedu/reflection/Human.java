package cn.tedu.reflection;

/**
 * @author: 向双
 * @date: 2021年04月26日 10时20分
 * @description:
 */
public class Human {
    public String name;
    private int age;
    double salary;

    public Human(){}
    public Human(String name,int age,double salan){
        this.name=name;
        this.age=age;
        this.salary=salan;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salan);
    }

    public void test1(){
        System.out.println("这是"+1);
    }
    private void test2(String a){
        System.out.println(a);
    }
    void test3(int a){
        System.out.println(a);
    }
}

