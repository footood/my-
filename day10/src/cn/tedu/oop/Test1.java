package cn.tedu.oop;

/**
 * @author: 向双
 * @date: 2021年04月19日 20时29分
 * @description: 测试接口
 */
public class Test1 {
    public static void main(String[] args) {
    A a = new B();
    a.show1();
    a.show2();
    }
}
interface A{
    abstract public void show1();
    abstract public void show2();
}
class B implements A{
    public void show1(){
        System.out.println(1);
    }
    public void show2(){
        System.out.println(2);
    }
}