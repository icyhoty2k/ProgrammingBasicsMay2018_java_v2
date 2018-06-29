package Lesson7AdvancedLoops;
 /**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW09SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num = 0;
        while (n >= 1) {
            num = num + (n % 10);
            n = n / 10;
        }
        System.out.println(num);
    }

}

