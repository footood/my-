package cn.tedu.inner;

/**
 * @author: 向双
 * @date: 2021年04月26日 16时46分
 * @description: 测试匿名类部类
 */
public class Test5 {
    public static void main(String[] args) {
        new H() {
            @Override
            public void save() {
                System.out.println(13456);
            }
            public void up() {
                System.out.println(666);
            }
        }.save();
        X x = new X(){
            @Override
            public void del(int id) {
                System.out.println(id);
            }
            public void get() {
                System.out.println(100);
            }
        };
        x.get();
        x.del(11);
    }
    interface X{
        void del(int id);
        void get();
    }
    interface H {
            void save();

            void up();

    }
}
//class HH implements H {
//
//    @Override
//    public void save() {
//        System.out.println(999);
//    }
//
//    public void up() {
//        System.out.println(1214);
//    }
//}