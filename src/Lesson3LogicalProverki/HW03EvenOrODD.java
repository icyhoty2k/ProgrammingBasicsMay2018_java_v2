package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW03EvenOrODD {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int num = Integer.parseInt(consoleInput.nextLine());
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
