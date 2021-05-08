package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021年04月17日 15时43分
 * @description: 测试 final关键字--可以修饰符/方法/变量
 */
public class Test7 {
    public static void main(String[] args) {
        Zi5 z = new Zi5();//创建子类对象 测试
        Fu5 z2 =new Zi5();//创建多态 测试
        z2.eat();
        z.eat();
    }
}
//1,final修饰的类,不能被继承
class Fu5{
    //2,final修饰的常量,只能继承,值不能被修改
    final String name = "jack";
    //3,final修饰的方法,只能继承,不能重写
    public void eat(){
        System.out.println(1);
    }
}
class Zi5 extends Fu5{
    //重写:
    public void eat(){
        System.out.println(100);
    }
}




