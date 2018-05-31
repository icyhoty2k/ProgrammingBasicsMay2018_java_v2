package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW10Number100_200 {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int x = Integer.parseInt(consoleInput.nextLine());
        if (x < 100) {
            System.out.println("Less than 100");
        } else if (x >= 100 && x <= 200) {
            System.out.println("Between 100 and 200");

        } else if (x > 200) {
            System.out.println("Greater than 200");
        }

    }
}
