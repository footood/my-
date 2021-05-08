package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 15ʱ16��
 * @description: ���� �̳���ķ���
 *�ܽ�:
 * 1,����:����ʹ�ü̳��Ը�������з���
 * ������ ��չ�Լ������еķ���
 * ������ �޸ļ̳����ķ���--��������д
 * �﷨Ҫ��:���㹻��Ȩ��(>=) +����ķ�������/ǩ�� ����͸���һ��
 * 2,������д,Ӱ��������ķ�����.���ǶԸ��಻�ܲ���Ӱ��.
 * 3,����ʱ��ԭ��:opc����ԭ��--�ر�Դ���޸�--���Ź�����չ
 */
public class Test2 {
    public static void main(String[] args) {
        Zi2 z = new Zi2();
        z.eat();//��дǰ,ʹ���˸����.��д��,ʹ���������
        //z.play();
        z.coding();
    }

}
class Fu2{
    public void eat(){
        System.out.println("ɶ����");
    }
    private void play(){
        System.out.println("ɶ����");
    }
}
//1,����̳и����,����ʹ�ø�������з���(����privat��)
class Zi2 extends Fu2{
    //3,����������ø����,�������Լ���չ,������д--������д
    //Ҫ��:����Ҫ���㹻��Ȩ��+���������͸���һ��
    public void eat(){
        System.out.println("������");
    }
    //2,��������ܹ��ø����,�������Լ���չ
    public void coding(){
        System.out.println("�ô���");
    }
}























