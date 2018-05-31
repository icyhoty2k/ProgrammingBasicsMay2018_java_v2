package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW15Equalnumbers {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int x, y, z;
        x = Integer.parseInt(consoleInput.nextLine());
        y = Integer.parseInt(consoleInput.nextLine());
        z = Integer.parseInt(consoleInput.nextLine());
        if (x == y && y == z) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}
