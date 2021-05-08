package cn.tedu.oop;

/**
 * @author: 向双
 * @date: 2021年04月19日 19时59分
 * @description: 测试抽象类的使用
 */
public class Test5 {
    public static void main(String[] args) {
        Fu3 f = new Zi4();

    }

}
abstract class Fu3{
    public Fu3(){
        System.out.println("这是父类的构造方法,用来new");
    }

    String name = "jack";
    public static final int AGE = 10;
    abstract public void eat1();
    abstract public void eat2();
    public void eat3(){
        System.out.println(3);
    }
}
class Zi4 extends Fu3{
    public Zi4(){
        super();
        System.out.println("这是子类的构造方法,用来new");
    }
    @Override
    public void eat1(){
        System.out.println(1);
    }
    public void eat2(){
        System.out.println(2);
    }
}