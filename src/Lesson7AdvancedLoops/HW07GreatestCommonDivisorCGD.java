package Lesson7AdvancedLoops;/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW07GreatestCommonDivisorCGD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        while ( b != 0){
            int oldB=b;
            b = a % b;
            a = oldB;
        }
        System.out.println(a);
    }

}

