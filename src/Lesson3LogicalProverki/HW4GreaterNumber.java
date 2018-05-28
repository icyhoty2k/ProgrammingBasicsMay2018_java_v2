package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW4GreaterNumber {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int num1, num2;
        num1 = Integer.parseInt(consoleInput.nextLine());
        num2 = Integer.parseInt(consoleInput.nextLine());
        if (num1 > num2) {
            System.out.println(num1);

        } else {
            System.out.println(num2);
        }
    }
}
