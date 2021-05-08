/**
 * @author: 向双
 * @date: 2021年04月20日 10时16分
 * @description: 测试泛型的通用性
 */
public class Test1 {
    public static void main(String[] args) {
        String[] a = {"杨幂","泡泡","虫虫","罅隙","血腥"};
        print(a);
        Integer[] b = {66,77,88,99};
        print(b);
    }

    public static <E> void print(E[] b) {
        for (E e:b) {
            System.out.println(e);
        }
    }


//    public static void print(String[] a) {
//        for (int i = 0; i <a.length; i++) {
//            System.out.println(a[i]);
//        }
//        for (String s : a) {
//            System.out.println(s);
//        }
//    }
}
