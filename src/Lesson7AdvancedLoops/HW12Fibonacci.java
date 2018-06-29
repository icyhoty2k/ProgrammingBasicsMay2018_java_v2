package Lesson7AdvancedLoops;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW12Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int f,fn , fNext;
        f=fn=1;
        fNext=0;
        for (int i = 0; i < n-1; i++) {
            fNext = f + fn;
            f = fn;
            fn = fNext;
        }
        System.out.println(fn);
    }

}

