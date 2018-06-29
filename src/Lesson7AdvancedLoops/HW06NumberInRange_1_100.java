package Lesson7AdvancedLoops;/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW06NumberInRange_1_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        while (true) {
            System.out.print("Еnter a number in the range [1...100]:");
            n = Integer.parseInt(sc.nextLine());
            if (n > 0 && n <= 100){
                System.out.println("The number is: " + n);
                break;
            }
            else {
                System.out.println("Invalid number!");
            }
        }
    }

}

