
package cn.tedu.oop;
//���� static�����
public class Test6 {
    public static void main(String[] args) {
        new Student();

        //new Student();
        //new Student();
        //new Student();
        //new Student();
        //ִ��˳��:
        //�������ʱ,ִ�о�̬�����
        //��new/ʵ����ʱ,ִ�� ��������͹��췽��
        //������������ʱ,ִ�� �ֲ������
    }
}
class Student{
    //TODO ��̬�����:�ڳ�Աλ��+������ʼ����Ŀ+�����ʱ����
    static {
        System.out.println("��̬�����");
    }
    //TODO Constructor:�ڳ�Աλ��+����new
    public Student() {
        System.out.println("���췽��");
    }
    //TODO ��������:�ڳ�Աλ��+������ȡ���췽����Ĺ���+newʱ����
    {
        System.out.println("��������");
    }
    //TODO �ֲ������:�ھֲ�λ��+�������Ʊ��������÷�Χ+���÷���ʱ
    public void show() {
        {
            System.out.println("�ֲ������");
        }
    }
}
