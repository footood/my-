package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 15ʱ43��
 * @description: ���� final�ؼ���--�������η�/����/����
 */
public class Test7 {
    public static void main(String[] args) {
        Zi5 z = new Zi5();//����������� ����
        Fu5 z2 =new Zi5();//������̬ ����
        z2.eat();
        z.eat();
    }
}
//1,final���ε���,���ܱ��̳�
class Fu5{
    //2,final���εĳ���,ֻ�ܼ̳�,ֵ���ܱ��޸�
    final String name = "jack";
    //3,final���εķ���,ֻ�ܼ̳�,������д
    public void eat(){
        System.out.println(1);
    }
}
class Zi5 extends Fu5{
    //��д:
    public void eat(){
        System.out.println(100);
    }
}




