package cn.tedu.oop;

/**
 * @author: 向双
 * @date: 2021年04月19日 19时53分
 * @description:
 */
public class Test4 {
    public static void main(String[] args) {
    Fu2 f = new Zi3();
    f.eat();
    f.game();
    }
}
abstract class Fu2{
    abstract public void eat();
    abstract public void game();
}
class Zi3 extends Fu2{
    @Override
public void eat(){
        System.out.println(1);
        }
        public void game(){
        System.out.println(2);
        }
        }
        abstract class Zi2 extends Fu2{

        }