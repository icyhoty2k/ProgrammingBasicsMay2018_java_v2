package Lesson7AdvancedLoops;/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num=1;
        for (int i = 0; i <= n; i+=2) {
            System.out.println(num);
            num = num * 2 * 2;

        }
    }


}

