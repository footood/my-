package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 16ʱ13��
 * @description: ��ϰ �̳�
 */
public class Test4 {
    static String d;

    public static void main(String[] args) {
        Demo d = new Demo();
        //��дǰcn.tedu.oop.Demo@15db9742,��дabc
        System.out.println(d.toString());
        //System.out.println(super.d);
    }
}
class Demo extends Object{
    //��д
    public String toString(){
        return"abc";
    }
}
class Fu4{
    //TODO Constructors..
    public Fu4(int a){//2,���ֻ�ṩ���ι���,��ʱ,�޲ι����û��
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
    //TODO 5,��д:��Ȩ��+���������͸���һ��
    public void eat(){
        System.out.println(100);
    }
    public Zi4(){
        //super();//1,�������ŵ�,���Զ����ø�����޲ι���
        super(100);//3,ֻ�ܵ��ø���ĺ��ι���
    }
    public void show(){
        System.out.println(super.age);
    }
}



