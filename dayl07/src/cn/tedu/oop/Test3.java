package cn.tedu.oop;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 11ʱ41��
 * @description: ���� ��������
 * �ܽ�:
 * 1,��������:��������ȡ�������Ĺ��Դ���+λ�����������淽����
 * 2,���췽��:������new/��ֵ+λ�����ڷ�����
 * 4,ִ�е�˳��:
 *      ��newʱ,��ִ�� �������� ��ִ�й��췽��
 *      ������������ʱ,��ִ�� �ֲ������
 */
public class Test3 {
    public static void main(String[] args) {
        //TODO 2,�����������
        new Teacher();
        new Teacher(10);
        new Teacher("jack");
        new Teacher('��');
        new Teacher("jack",20);
    }

}
class Teacher{
    //TODO 2,��������:λ�����ڳ�Աλ��
        //newʱ�����������ڹ��췽��ǰ+������ȡ���췽���Ĺ���
    {
        //��ȡ�����й��췽������ظ�����--����˴���ĸ�����
        System.out.println("�й���");
        System.out.println("��������");

    }
    //TODO 1,���췽��/Constructors
    public Teacher(){
    }
    public Teacher(int a ){
    }
    public Teacher(String b){
    }
    public Teacher(String a,int b){
    }
    public void show(){
        int a=0;//�ֲ�����
        //3,�ֲ������--λ�����ڷ�����+�������Ʊ��������÷�Χ
        //������������ʱ,���ܴ���
        {
            int b=10;
            System.out.println("�ֲ������");
        }
      //  System.out.println(b);//������������,�ò���
        System.out.println(a);//������,��ʹ�÷�Χ��
    }




}


















