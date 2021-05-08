import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: 向双
 * @date: 2021年04月22日 18时38分
 * @description:
 */
class Test {
    public void demo(String str) {
        String[] arr = str.split(";");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        char array[] = {'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ',
                'g', 'h', ';', 'i', 'j', ' ', 'k', 'l'};
        String str = new String(array);
        Test obj = new Test();
        obj.demo(str);
    }
}