package cn.tedu.oop;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 14ʱ31��
 * @description: ���Լ̳�
 */
public class Test5 {
    public static void main(String[] args) {
        //TODO 3,��������������
        Dog d = new Dog();
        d.eat();//���˸����
        d.sleep();//���˸����
        //System.out.println(d.sifangmoney);//���ܼ̳и����˽�г�Ա

        //TODO �̳еĴ�����
        DaHuang dh = new DaHuang();
        dh.eat();//����үү��Ĺ���
        dh.sleep();//����үү��Ĺ���
        dh.kanjia();//���˸���Ĺ���
    }
}
//1,��������--��ȡ��������й��ԵĴ���/����˸��������ĸ�����
class Animal2{
    //2.3,���ܼ̳и����˽�г�Ա
    private double sifangmoney = 5;
    public void eat(){
        System.out.println("ɶ����");
    }
    public void sleep(){
        System.out.println("��˯��");
    }
}
//2,��������--ʹ��extends�ؼ���,�̳и����,�����˴���ı�д
class Dog extends Animal2{
    public void kanjia(){}
    //2.2,javaֻ֧�ֵ����̳�
    //2.1,�൱������Ѹ���Ĺ��ܸ�����һ��
}
class DaHuang extends Dog{
        //2.2,javaֻ֧�ֵ����̳�
        //2.1,�൱������Ѹ���Ĺ��ܸ�����һ��
}

























