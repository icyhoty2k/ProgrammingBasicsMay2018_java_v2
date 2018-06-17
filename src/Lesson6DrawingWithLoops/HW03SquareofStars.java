package Lesson6DrawingWithLoops;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW03SquareofStars {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int n = Integer.parseInt(consoleInput.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
