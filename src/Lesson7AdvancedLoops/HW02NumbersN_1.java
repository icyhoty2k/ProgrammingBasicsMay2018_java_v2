package Lesson7AdvancedLoops;/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW02NumbersN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

}

