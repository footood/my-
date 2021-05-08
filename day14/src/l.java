/**
 * @author: 向双
 * @date: 2021年04月20日 12时43分
 * @description:
 */
public class l {
    public static void main(String[] args) {
        System.out.println(getNum());
    }
    public static int getNum() {
        int n = 1;
        try {
            n = 2;
            //return n;
            //throw new RuntimeException();
        } catch (Exception e) {
            n = 3;
            return n;
        } finally {
            n = 4;
        }return n;
    }
}

