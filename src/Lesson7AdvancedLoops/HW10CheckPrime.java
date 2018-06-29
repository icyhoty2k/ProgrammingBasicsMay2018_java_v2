package Lesson7AdvancedLoops;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW10CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean prime =true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }

        }
        if (prime) { System.out.println("Prime"); }
        else System.out.println("Not prime");

    }


}

