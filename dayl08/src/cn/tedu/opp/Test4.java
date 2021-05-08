package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021年04月17日 16时13分
 * @description: 练习 继承
 */
public class Test4 {
    static String d;

    public static void main(String[] args) {
        Demo d = new Demo();
        //重写前cn.tedu.oop.Demo@15db9742,重写abc
        System.out.println(d.toString());
        //System.out.println(super.d);
    }
}
class Demo extends Object{
    //重写
    public String toString(){
        return"abc";
    }
}
class Fu4{
    //TODO Constructors..
    public Fu4(int a){//2,如果只提供含参构造,此时,无参构造就没了
        System.out.println(1);
    }
    //TODO Fields..
    int age = 10;
    //TODO Methods..
    public void eat(){
        System.out.println(1);
    }
}
class Zi4 extends Fu4{
    //TODO 5,重写:有权限+方法声明和父类一样
    public void eat(){
        System.out.println(100);
    }
    public Zi4(){
        //super();//1,是隐藏着的,会自动调用父类的无参构造
        super(100);//3,只能调用父类的含参构造
    }
    public void show(){
        System.out.println(super.age);
    }
}



