package Lesson7AdvancedLoops;/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW03PowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num=1;
        System.out.println(num);
        for (int i = 1; i <= n; i++) {
            num=num*2;
            System.out.println(num);

        }
    }



}

