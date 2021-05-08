package cn.tedu.server;

/**
 * @author: 向双
 * @date: 2021年04月27日 16时35分
 * @description:
 */
public class Test6 {
    public static void main(String[] args) {
//       new A(){
//
//           @Override
//           public void save() {
//               System.out.println("ffff");
//           }
//       }.save();
        A a = ()->{System.out.println("sf"); };
        a.save();
        B b = (int m)->{
            System.out.println(m);
        };
        b.get(10);

        C c =(int id,String name)->{
            System.out.println(id+name);
        };
        c.del(11,"aa");

        D d = (int x)->{return x*10;};
        int e = d.select(100);
        System.out.println(e);
    }
}
interface D{
    int select(int id);
}
interface C{
    void del(int id, String name);
}

interface B{
    void get(int id);
}
interface A{
    void save();

}
