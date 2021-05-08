package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021年04月17日 16时38分
 * @description: 测试 static关键字
 */
public class Test5 {
    public static void main(String[] args){
        //TODO 创建对象测试
        Person p = new Person();
        p.eat();
        System.out.println(p.age);
        p.sleep();
        System.out.println(p.name);
        //1,static 的资源,可以通过对象访问+类名访问
        Person.sleep();
        System.out.println(Person.name);
        Person p1 = new Person();
        p1.name="快乐";
        Person p2 = new Person();
        System.out.println(p2.name);
        Person p3 = new Person();
        System.out.println(p3.name);
        Person p4 = new Person();
        System.out.println(p4.name);


    }

}
class Person{
    //TODO 普通资源
    int age = 10;
    public void eat(){
        //TODO 4.2,普通资源可以调用所有资源(普通的/静态的)
        System.out.println(1);
        System.out.println(name);
    }
    //TODO 静态资源
    //1,static 可以修饰 成员变量和方法
    //2,static资源优先于对象的加载
    //3,static资源是共享的,可以直接被类名调用
    static String name = "tony";
    static public void sleep(){
        //TODO 4,静态资源调用普通资源?--不能直接调用,必须修饰成static的
        //System.out.println(name);
        //TODO 4.1,静态资源调用静态资源?--可以
        System.out.println(name);
        System.out.println(1);
    }


}








