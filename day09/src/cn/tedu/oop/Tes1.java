package cn.tedu.oop;

/**
 * @author: ��˫
 * @date: 2021��04��19�� 09ʱ55��
 * @description: ��̬
 */
public class Tes1 {
    public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();
    Animal a = new Dog();
    a.eat();
        System.out.println(a.age);
       // System.out.println(a.name);
    }
}
class Animal{
    int age =10;
    public void eat(){
        System.out.println("回复");
    }
}
class Dog extends Animal{
    String name = "jack";
    public void eat(){
        System.out.println("谈话");
    }
}