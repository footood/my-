package cn.tedu.oop;

/**
 * @author: ��˫
 * @date: 2021��04��19�� 10ʱ05��
 * @description: ���� ��̬��ʹ��
 */
public class Test2 {
    public static void main(String[] args) {
    Fu f = new Zi();
        System.out.println(f.age);
        f.eat();
        f.sleep();
        f.game();
        Fu.game();
    }
}
class Fu{
    int age = 10;
    static public void game(){
        System.out.println(1);
    }
    public void eat(){
        System.out.println(1);
    }
    public void sleep(){
        System.out.println(2);
    }
}
class Zi extends Fu{
    int age = 20;
    static public void game(){
        System.out.println(2);
    }
    public void eat(){
        System.out.println(100);
    }
    public void show(){
        System.out.println(200);
    }


}












