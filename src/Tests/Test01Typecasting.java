package Tests;

/**
 * @author icyhoty2k
 */


public class Test01Typecasting {
    public static void main(String[] args) {
        int a = 0;
        double x = 4.99;
        a = (int) x;
        String s;
        s = String.valueOf(x);
        System.out.println(a);
        char c = 'w';
        int cTOi = (int) 'L';
        System.out.println(cTOi);
        c = (char) 65;
        System.out.println(c);
    }
}
