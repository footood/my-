package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 15ʱ01��
 * @description: ���� �̳���ĳ�Ա����
 */
public class Test1 {
    public static void main(String[] args) {
        //TODO �����������
        new Zi().show();
        //�����ԵĲ���:Ҫô��ӡҪô��ֵ
    }
}
class Fu{
    String name = "jack";
}
class Zi extends Fu{
    String name = "rose";
    int age = 10 ;//�ֲ�����
    public void show(){
        int age = 10;//�ֲ�����
        System.out.println(age);//10,�ͽ�ԭ��,����ʹ�þֲ�����
        System.out.println(this.age);//20;this�����˱���ĳ�Ա����
        System.out.println(name);//ʹ�����������Դrose
        //1,super��������������.Fu super = new Fu();
        //2,super����������,���ø���Ĺ���
        System.out.println(super.name);//ʹ���˸������Դjack
    }
}
