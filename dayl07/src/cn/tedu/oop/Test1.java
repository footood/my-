package cn.tedu.oop;
//���� ��װ
public class Test1 {
    public static void main(String[] args) {
        //TODO ����Student����
        Student s = new Student();
        //���÷���
//		s.coding();//��Ϊcoding()����װ��,�޷�ʹ��
        s.game();
        //��������
//		s.name = "������";//��Ϊname����װ��,�޷�ʹ��
//		s.no = 100;
//		s.sex = '��' ;
        s.setName("������");//����ֵ
        s.setNo(1);
        s.setSex('��');
        //��ȡ����
//		System.out.println(s.name);//��Ϊname����װ��,�޷�ʹ��
//		System.out.println(s.no);
//		System.out.println(s.sex);
        System.out.println(s.getName());//��ȡֵ
        System.out.println(s.getNo());//��ȡֵ
        System.out.println(s.getSex());//��ȡֵ
    }
}

